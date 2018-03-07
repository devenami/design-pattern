package com.designpattern.mediator;

/**
 * 中介者
 *
 * @author zhoutt
 * @create 2018-03-07 13:44
 */
public class Mediator extends AbstractMediator {
    
    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }
    
    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number * 100);
    }
    
    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number / 100);
    }
}
