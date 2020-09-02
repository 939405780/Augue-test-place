package com.augue.test.demo2;

/**
 * @program: thread_test
 * @description: 当一个线程访问对象的synchronized同步代码块时，另一个线程仍然可以访问该对象中的非synchronized同步代码块。
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 14:32
 **/
public class Counter implements Runnable {

    private int count;

    public void countAdd() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printCount() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + (count++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("A")) {
            countAdd();
        } else if (name.equals("B")) {
            printCount();
        }
    }
}
