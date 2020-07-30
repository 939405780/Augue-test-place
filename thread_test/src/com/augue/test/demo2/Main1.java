package com.augue.test.demo2;

/**
 * @program: thread_test
 * @description: test
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 14:42
 **/
public class Main1 {
    public static void main(String[] args) {
        /**
         * @Description: 上面代码中countAdd是一个synchronized的，printCount是非synchronized的。
         * 从上面的结果中可以看出一个线程访问一个对象的synchronized代码块时，
         * 别的线程可以访问该对象的非synchronized代码块而不受阻塞。
         * @Date: 2020/7/30
         */
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        thread1.start();
        thread2.start();
    }
}
