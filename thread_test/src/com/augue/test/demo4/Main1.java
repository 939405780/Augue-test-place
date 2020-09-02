package com.augue.test.demo4;

/**
 * @program: thread_test
 * @description: test
 * @author: Augue 939405780@qq.com
 * @create: 2020-07-31 09:09
 **/
public class Main1 {
    /**
     * @Description: synchronized修饰一个方法很简单，就是在方法的前面加synchronized，
     * 修饰方法和修饰一个代码块类似，只是作用范围不一样，修饰代码块是大括号括起来的范围，
     * 而修饰方法是整个函数。
     * @Date: 2020/7/31
     */
    public synchronized void run() {
        // 这种写法
    }
    /**
     * 使用synchronized关键字修饰方法需要注意几点：
     * 1. synchronized不能继承。父类方法中使用了synchronized关键字，子类继承时，
     *    需要手动在方法上加上synchronized关键字才能让该方法同步。
     * 2. 在定义接口方法时不能使用synchronized关键字。
     * 3. 构造方法不能使用synchronized关键字，但可以使用synchronized代码块进行同步。
     */
}
