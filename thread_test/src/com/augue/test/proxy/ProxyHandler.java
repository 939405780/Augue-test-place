package com.augue.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: thread_test
 * @description: 接口、被代理类不变，我们构建一个handler类来实现InvocationHandler接口。
 * @author: Augue 939405780@qq.com
 * @create: 2020-08-13 13:49
 **/
public class ProxyHandler implements InvocationHandler {

    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke " + method.getName());
        method.invoke(object, args);
        System.out.println("After invoke " + method.getName());
        return null;
    }
}
