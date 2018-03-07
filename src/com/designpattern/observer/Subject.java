package com.designpattern.observer;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author zhoutt
 * @create 2018-03-07 15:32
 */
public abstract class Subject {
    
    // 用于保存所有被观察者
    private Vector<Observer> obs = new Vector();
    
    // 添加被观察者
    public void addObserver(Observer obs) {
        this.obs.add(obs);
    }
    
    // 用于删除被观察者
    public void delObserver(Observer obs) {
        this.obs.remove(obs);
    }
    
    // 通知所有被观察者
    protected void notifyObserver() {
        for (Observer o : obs)
            o.update();
    }
    
    public abstract void doSomething();
    
}
