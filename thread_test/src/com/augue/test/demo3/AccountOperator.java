package com.augue.test.demo3;

/**
 * @program: thread_test
 * @description: 账户操作类
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-31 08:52
 **/
public class AccountOperator implements Runnable {

    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (this) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
}
