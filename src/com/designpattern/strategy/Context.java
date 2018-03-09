package com.designpattern.strategy;

/**
 * 封装类
 *
 * @author zhoutt
 * @create 2018-03-09 14:53
 */
public class Context {
    
    private IStrategy strategy;
    
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void execute() {
        strategy.doSomething();
    }
    
}
