package com.designpattern.visitor;

/**
 * @author zhoutt
 * @create 2018-03-07 16:34
 */
public class ConcreteElement1 extends Element {
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public void doSomething() {
        System.out.println("这是元素2");
    }
}
