package com.designpattern.factory.method_factory.demo;

/**
 * 工程方法的使用
 *
 * @author zhoutt
 * @create 2018-03-05 14:12
 */
public class Client {
    
    public static void main(String[] args) {
        IFactory factory = new Factory();
        ICar car = factory.createCar();
        car.show();
    }
    
}
