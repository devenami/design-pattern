package com.designpattern.factory.abstract_factory;

/**
 * 工厂接口
 *
 * @author zhoutt
 * @create 2018-03-05 16:44
 */
public interface IFactory {
    IProduct1 createProduct1();
    IProduct2 createProduct2();
}
