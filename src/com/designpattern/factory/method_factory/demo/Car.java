package com.designpattern.factory.method_factory.demo;

/**
 * 汽车
 *
 * @author zhoutt
 * @create 2018-03-05 13:25
 */
public class Car implements ICar {
    
    private Underpan underpan;
    private Wheel wheel;
    private Engine engine;
    
    public Car(Underpan underpan, Wheel wheel, Engine engine) {
        this.underpan = underpan;
        this.wheel = wheel;
        this.engine = engine;
    }
    
    @Override
    public void show() {
        underpan.getStyle();
        wheel.getStyle();
        engine.getStyle();
    }
    
}
