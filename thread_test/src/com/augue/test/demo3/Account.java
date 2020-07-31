package com.augue.test.demo3;

/**
 * @program: thread_test
 * @description: 指定给某个对象加锁
 * 银行账户类
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-30 15:08
 **/
public class Account {

    private String name;
    private float amount;

    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    /**
     * @Description: 存钱
     * @Date: 2020/7/31
     */
    public void deposit(float amt) {
        amount += amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description: 取钱
     * @Date: 2020/7/31
     */
    public void withdraw(float amt) {
        amount -= amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public float getBalance() {
        return amount;
    }
}
