package com.designpattern.visitor;

import java.util.List;

/**
 * @author zhoutt
 * @create 2018-03-07 16:41
 */
public class Client {
    
    public static void main(String[] args) {
        List<Element> list = ObjectStruture.getList();
        for (Element element : list) {
            element.accept(new Visitor());
        }
    }
    
}
