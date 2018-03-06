package com.designpattern.builder;

/**
 * 建造者
 *
 * @author zhoutt
 * @create 2018-03-06 15:44
 */
public class ConcreteBuilder extends Builder {
    
    private Product product = new Product();
    
    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
    
    @Override
    public Product getProduct() {
        return product;
    }
}
