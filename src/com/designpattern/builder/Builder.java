package com.designpattern.builder;

/**
 * 抽象建造者
 *
 * @author zhoutt
 * @create 2018-03-06 15:38
 */
public abstract class Builder {
    
    public abstract void setPart(String arg1, String arg2);
    
    public abstract Product getProduct();
    
}
