package com.designpattern.mediator;

/**
 * 抽象中介者
 *
 * @author zhoutt
 * @create 2018-03-07 13:39
 */
public abstract class AbstractMediator {
    
    // 同事类A
    protected AbstractColleague A;
    // 同事类B
    protected AbstractColleague B;
    
    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }
    
    public abstract void AaffectB();
    
    public abstract void BaffectA();
}
