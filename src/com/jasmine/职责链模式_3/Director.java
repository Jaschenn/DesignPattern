package com.jasmine.职责链模式_3;

public class Director extends Hander {
    @Override
    public void handleRequest(int money) {
        if(money<1){
            System.out.println("主任审批");
        }else {
            this.successor.handleRequest(money);
        }
    }
}
