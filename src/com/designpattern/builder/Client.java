package com.designpattern.builder;

/**
 * @author zhoutt
 * @create 2018-03-06 15:52
 */
public class Client {
    
    public static void main(String[] args) {
        Director director = new Director();
        Product aProduct = director.getAProduct();
        aProduct.showProduct();
    
        Product bProduct = director.getBProduct();
        bProduct.showProduct();
    }
    
}
