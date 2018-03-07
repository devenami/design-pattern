package com.designpattern.visitor;

/**
 * 元素类
 * @author zhoutt
 * @create 2018-03-07 16:34
 */
public class ConcreteElement2 extends Element {
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public void doSomething() {
        System.out.println("这是元素1");
    }
}
