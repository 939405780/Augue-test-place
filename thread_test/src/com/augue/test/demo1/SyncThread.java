package com.augue.test.demo1;

/**
 * @program: thread_test
 * @description: Synchronized修饰一个代码块
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 09:03
 **/
public class SyncThread implements Runnable {

    private static int count;

    public SyncThread() {
        count = 0;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count ++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}
