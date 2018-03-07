package com.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 结构对象
 *
 * @author zhoutt
 * @create 2018-03-07 16:38
 */
public class ObjectStruture {
    
    public static List<Element> getList() {
        List<Element> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int a = ran.nextInt(100);
            if (a > 50) {
                list.add(new ConcreteElement1());
            } else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
    
}
