package com.designpattern.command;

/**
 * 调用者
 *
 * @author zhoutt
 * @create 2018-03-08 14:02
 */
public class Invoker {
    
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void action() {
        this.command.execute();
    }
    
}
