package com.designpattern.command;

/**
 * 命令实现类
 *
 * @author zhoutt
 * @create 2018-03-08 13:59
 */
public class ConcreteCommand extends Command {
    
    private Receiver receiver;
    
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    void execute() {
        this.receiver.doSomething();
    }
}
