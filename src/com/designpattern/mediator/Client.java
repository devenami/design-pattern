package com.designpattern.mediator;

/**
 * @author zhoutt
 * @create 2018-03-07 13:46
 */
public class Client {
    
    public static void main(String[] args) {
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();
        
        AbstractMediator am = new Mediator(collA, collB);
        
        System.out.println("============== 通过设置A影响B =============");
        collA.setNumber(100, am);
        System.out.println("collA的number值为：" + collA.getNumber());
        System.out.println("collB的number值为: " + collB.getNumber());
        
        System.out.println("============== 通过设置B影响A =============");
        collB.setNumber(1000, am);
        System.out.println("collA的number值为：" + collA.getNumber());
        System.out.println("collB的number值为: " + collB.getNumber());
    }
    
}
