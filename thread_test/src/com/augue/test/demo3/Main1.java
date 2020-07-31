package com.augue.test.demo3;

/**
 * @program: thread_test
 * @description: test
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 15:07
 **/
public class Main1 {
    public static void main(String[] args) {
        /** 
         * @Description: 在AccountOperator类中的run方法里，我们用synchronized给account对象加了锁。
         * 这时，当一个线程访问account对象时，其它试图访问account对象的线程将会阻塞，
         * 直到该线程访问account对象结束。
         * @Date: 2020/7/31 
         */
        Account account = new Account("Augue", 1000);
        AccountOperator accountOperator = new AccountOperator(account);

        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < threads.length; i ++) {
            threads[i] = new Thread(accountOperator, "Thread" + i);
            threads[i].start();
        }
    }
}
