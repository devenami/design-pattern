package com.designpattern.observer;

/**
 * 观察者实现一
 *
 * @author zhoutt
 * @create 2018-03-07 15:39
 */
public class ConcreteObserver1 implements Observer {
    
    @Override
    public void update() {
        System.out.println("观察者1收到信息，并进行处理。");
    }
}
