package com.jasmine.职责链模式_3;

public abstract class Hander {
    protected Hander successor;
    public abstract void handleRequest(int money);
    public  void setSuccessor(Hander successor){
        this.successor = successor;
    };
}
