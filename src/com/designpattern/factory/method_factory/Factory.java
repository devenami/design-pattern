package com.designpattern.factory.method_factory;

public class Factory implements IFactory {
    
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}