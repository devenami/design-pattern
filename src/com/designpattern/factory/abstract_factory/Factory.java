package com.designpattern.factory.abstract_factory;

/**
 * 工厂
 *
 * @author zhoutt
 * @create 2018-03-05 16:45
 */
public class Factory implements IFactory {
    
    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }
    
    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}
