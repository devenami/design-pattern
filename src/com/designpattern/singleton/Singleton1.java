package com.designpattern.singleton;

/**
 * 懒汉式单例
 *
 * @author zhoutt
 * @create 2018-03-05 9:07
 */
public class Singleton1 {
    
    private static Singleton1 singleton = new Singleton1();
    
    private Singleton1() {
    }
    
    public static Singleton1 getInstance() {
        return singleton;
    }
    
}
