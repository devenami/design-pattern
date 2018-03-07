package com.designpattern.observer;

/**
 * 观察者实现二
 *
 * @author zhoutt
 * @create 2018-03-07 15:40
 */
public class ConcreteObserver2 implements Observer {
    
    @Override
    public void update() {
        System.out.println("观察者2收到信息，并进行处理。");
    }
}
