package com.designpattern.observer;

/**
 * 被观察者实现类
 *
 * @author zhoutt
 * @create 2018-03-07 15:38
 */
public class ConcreteSubject extends Subject {
    
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}
