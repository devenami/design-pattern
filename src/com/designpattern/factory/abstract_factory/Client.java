package com.designpattern.factory.abstract_factory;

/**
 * @author zhoutt
 * @create 2018-03-05 16:46
 */
public class Client {
    
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
    
}
