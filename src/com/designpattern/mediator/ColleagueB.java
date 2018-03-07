package com.designpattern.mediator;

/**
 * 同事类B
 *
 * @author zhoutt
 * @create 2018-03-07 13:41
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
