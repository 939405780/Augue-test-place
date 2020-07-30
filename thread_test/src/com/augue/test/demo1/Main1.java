package com.augue.test.demo1;

public class Main1 {

    public static void main(String[] args) {
        /**
         * @Description: synchronized关键字修饰代码块时，作用的对象是调用这个代码块的对象。
         * 当两个并发线程(thread1和thread2)访问同一个对象(syncThread)中的synchronized代码块时，
         * 在同一时刻只能有一个线程得到执行，另一个线程受阻塞，必须等待当前线程执行完这个代码块以后才能执行该代码块。
         * Thread1和thread2是互斥的，因为在执行synchronized代码块时会锁定当前的对象，
         * 只有执行完该代码块才能释放该对象锁，下一个线程才能执行并锁定该对象。
         * @Date: 2020/7/30
         */
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
        /**
         * @Description: 执行结果如下：
         * SyncThread1:0
         * SyncThread1:1
         * SyncThread1:2
         * SyncThread1:3
         * SyncThread1:4
         * SyncThread2:5
         * SyncThread2:6
         * SyncThread2:7
         * SyncThread2:8
         * SyncThread2:9
         * @Date: 2020/7/30
         */
    }
}
