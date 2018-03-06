package com.designpattern.prototype;


/**
 * 原型类
 *
 * @author zhoutt
 * @create 2018-03-06 16:36
 */
public class Prototype implements Cloneable {
    
    /**
     * 修改权限访问符为public,返回值为Prototype
     */
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
