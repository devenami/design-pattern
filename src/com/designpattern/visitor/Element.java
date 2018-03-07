package com.designpattern.visitor;

/**
 * 抽象元素类
 *
 * @author zhoutt
 * @create 2018-03-07 16:32
 */
public abstract class Element {
    
    public abstract void accept(IVisitor visitor);
    
    public abstract void doSomething();
    
}
