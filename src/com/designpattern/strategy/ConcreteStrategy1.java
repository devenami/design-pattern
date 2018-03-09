package com.designpattern.strategy;

/**
 * 具体策略1
 *
 * @author zhoutt
 * @create 2018-03-09 14:52
 */
public class ConcreteStrategy1 implements IStrategy {
    
    @Override
    public void doSomething() {
        System.out.println("具体策略1");
    }
}
