package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器实现类
 *
 * @author zhoutt
 * @create 2018-03-09 17:37
 */
public class ConcreteAggregate implements Aggregate {
    
    private List list = new ArrayList();
    
    @Override
    public void add(Object obj) {
        list.add(obj);
    }
    
    @Override
    public void remove(Object object) {
        list.remove(object);
    }
    
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
