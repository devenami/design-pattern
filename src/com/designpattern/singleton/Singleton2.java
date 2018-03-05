package com.designpattern.singleton;

/**
 * 懒汉模式
 *
 * @author zhoutt
 * @create 2018-03-05 9:18
 */
public class Singleton2 {
    
    private static Singleton2 singleton;
    
    private Singleton2() {
    }
    
    public static Singleton2 getInstance() {
        if (singleton == null)
            singleton = new Singleton2();
        return singleton;
    }
    
}
