package com.designpattern.observer;

/**
 * @author zhoutt
 * @create 2018-03-07 15:41
 */
public class Client {
    
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
    
}
