package com.augue.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: thread_test
 * @description: 测试类
 * @author: Augue 939405780@qq.com
 * @create: 2020-08-13 14:11
 **/
public class MainTest {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloInterface hello = new Hello();

        InvocationHandler handler = new ProxyHandler(hello);

        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);

        proxyHello.sayHello();
    }
}
