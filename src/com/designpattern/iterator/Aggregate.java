package com.designpattern.iterator;

/**
 * 抽象容器
 *
 * @author zhoutt
 * @create 2018-03-09 17:35
 */
public interface Aggregate {
    void add(Object obj);
    
    void remove(Object object);
    
    Iterator iterator();
}
