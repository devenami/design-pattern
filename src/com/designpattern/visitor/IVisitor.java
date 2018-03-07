package com.designpattern.visitor;

/**
 * @author zhoutt
 * @create 2018-03-07 16:33
 */
public interface IVisitor {
    
    void visit(ConcreteElement1 el1);
    void visit(ConcreteElement2 el2);
    
}
