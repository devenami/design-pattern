package com.designpattern.prototype;

/**
 * @author zhoutt
 * @create 2018-03-06 16:40
 */
public class Client {
    
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 100; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
    
    
}
