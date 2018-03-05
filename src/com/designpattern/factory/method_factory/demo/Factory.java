package com.designpattern.factory.method_factory.demo;

/**
 * 工厂
 *
 * @author zhoutt
 * @create 2018-03-05 14:10
 */
public class Factory implements IFactory {
    @Override
    public ICar createCar() {
        Engine engine = new Engine();
        Wheel wheel = new Wheel();
        Underpan underpan = new Underpan();
        ICar car = new Car(underpan, wheel, engine);
        return car;
    }
}
