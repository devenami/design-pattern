package com.designpattern.mediator;

/**
 * 抽象同事类
 *
 * @author zhoutt
 * @create 2018-03-07 13:37
 */
public abstract class AbstractColleague {
    
    protected int number;
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    // 该位置的参数不是一个同事类，而是一个中介者
    public abstract void setNumber(int number, AbstractMediator am);
}
