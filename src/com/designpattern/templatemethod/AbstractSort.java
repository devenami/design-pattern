package com.designpattern.templatemethod;

/**
 * 抽象类
 *
 * @author zhoutt
 * @create 2018-03-06 17:16
 */
public abstract class AbstractSort {
    
    /**
     * 抽象方法
     * 将数组由小到大排序
     *
     * @param array
     */
    protected abstract void sort(int[] array);
    
    /**
     * 模板方法
     * @param array
     */
    public final void showSortResult(int[] array) {
        this.sort(array);
        System.out.println("排序结果");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3s", array[i]);
        }
    }
    
}
