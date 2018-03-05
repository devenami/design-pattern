package com.designpattern.factory.abstract_factory;

/**
 * 产品1
 *
 * @author zhoutt
 * @create 2018-03-05 16:43
 */
public class Product1 implements IProduct1 {
    @Override
    public void show() {
        System.out.println("这是产品1");
    }
}
