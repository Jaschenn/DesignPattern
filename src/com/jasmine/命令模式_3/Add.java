package com.jasmine.命令模式_3;

public class Add extends Command {
    @Override
    public void execute() {
        commandStack.push(this.getClass());
    }

}
