package com.designpattern.builder;

/**
 * 导演类
 *
 * @author zhoutt
 * @create 2018-03-06 15:48
 */
public class Director {
    
    private Builder builder = new ConcreteBuilder();
    
    /**
     * 产品A
     *
     * @return
     */
    public Product getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }
    
    /**
     * 产品B
     *
     * @return
     */
    public Product getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }
    
}
