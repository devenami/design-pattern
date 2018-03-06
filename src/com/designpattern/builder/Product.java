package com.designpattern.builder;

/**
 * 产品
 *
 * @author zhoutt
 * @create 2018-03-06 15:31
 */
public class Product {
    
    private String name;
    private String type;
    
    public void showProduct() {
        System.out.println("名称" + name);
        System.out.println("型号:" + type);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
