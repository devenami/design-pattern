package com.designpattern.templatemethod;

/**
 * @author zhoutt
 * @create 2018-03-06 17:30
 */
public class Client {
    
    public static int[] a = {10, 30, 1, 9, 5, 7, 12, 0, 4, 3};
    
    public static void main(String[] args) {
        AbstractSort s = new ConcreteSort();
        s.showSortResult(a);
    }
    
}
