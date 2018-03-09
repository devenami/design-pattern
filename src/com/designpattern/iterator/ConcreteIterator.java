package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器
 *
 * @author zhoutt
 * @create 2018-03-09 17:31
 */
public class ConcreteIterator implements Iterator {
    
    private List list = new ArrayList();
    private int cursor = 0;
    
    public ConcreteIterator(List list) {
        this.list = list;
    }
    
    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext())
            obj = this.list.get(cursor++);
        return obj;
    }
    
    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }
}
