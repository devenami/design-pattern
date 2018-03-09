package com.designpattern.strategy;

/**
 * @author zhoutt
 * @create 2018-03-09 14:59
 */
public class Client {
    
    public static void main(String[] args) {
        Context context;
        System.out.println("--- 执行策略1 ---");
        context = new Context(new ConcreteStrategy1());
        context.execute();
    
        System.out.println("--- 执行策略2 ---");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
    
}
