package com.designpattern.mediator;

/**
 * 同事类A
 *
 * @author zhoutt
 * @create 2018-03-07 13:40
 */
public class ColleagueA extends AbstractColleague {
    
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}
