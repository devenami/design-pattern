package com.designpattern.factory.method_factory;

public class Product implements IProduct {
    
    @Override
    public void productMethod() {
        System.out.println("产品");
    }
    
}