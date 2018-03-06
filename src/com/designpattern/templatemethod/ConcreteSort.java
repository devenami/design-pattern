package com.designpattern.templatemethod;

/**
 * 模板方法实现类
 *
 * @author zhoutt
 * @create 2018-03-06 17:20
 */
public class ConcreteSort extends AbstractSort {
    
    @Override
    protected void sort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    // 交换位置
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
