package com.jasmine.命令模式_3;

import java.util.Stack;

public abstract class Command {
    Stack commandStack = new Stack();
    private Receiver receiver;
    public abstract void execute();
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public Command() {
    }
}
