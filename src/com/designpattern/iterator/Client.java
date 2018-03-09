package com.designpattern.iterator;

/**
 * @author zhoutt
 * @create 2018-03-09 17:39
 */
public class Client {
    
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("ming");
        ag.add("hong");
        ag.add("gang");
        Iterator iterator = ag.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }
    
}
