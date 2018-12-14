package com.jasmine.职责链模式_3;

public class Manager extends Hander {
    @Override
    public void handleRequest(int money) {
        if(money<5){
            System.out.println("经理审批");
        }else {
            this.successor.handleRequest(money);
        }
    }
}
