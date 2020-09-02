package com.augue.test.proxy;

/**
 * @program: thread_test
 * @description: 被代理类
 * @author: Augue 939405780@qq.com
 * @create: 2020-08-13 14:12
 **/
public class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("say hello!");
    }
}
