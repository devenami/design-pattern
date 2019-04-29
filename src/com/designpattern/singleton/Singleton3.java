package com.designpattern.singleton;

/**
 * 懒汉模式
 *
 * @author zhoutt
 * @create 2019-04-29 16:33
 */
public class Singleton3 {
    
    private static Singleton3 singleton;
    
    private Singleton3() {
    }
    
    // 懒汉模式在多线程情况下会出现问题，
    // 需要使用同步锁来解决
    public static Singleton3 getInstance() {
        if (singleton == null)
            synchronized(Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        return singleton;
    }
    
}
