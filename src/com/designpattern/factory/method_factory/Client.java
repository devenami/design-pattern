package com.designpattern.factory.method_factory;

/**
 * 工厂模式
 *
 * @author zhoutt
 * @create 2018-03-05 11:05
 */
public class Client {
    
    
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
