package com.augue.test.demo1;

/**
 * @program: thread_test
 * @description:
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 09:29
 **/
public class Main2 {
    public static void main(String[] args) {
        /**
         * @Description: 2个线程使用不同对象时，同步锁是在对象上，
         * 所以会创建2个同步锁，并且互不干扰。
         * @Date: 2020/7/30
         */
        Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
        Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
        thread1.start();
        thread2.start();
        /**
         * @Description: 输出结果如下：
         * SyncThread1:0
         * SyncThread2:1
         * SyncThread2:2
         * SyncThread1:3
         * SyncThread1:4
         * SyncThread2:4
         * SyncThread1:5
         * SyncThread2:5
         * SyncThread2:6
         * SyncThread1:6
         * @Date: 2020/7/30
         */
    }
}
