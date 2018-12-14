package com.jasmine.职责链模式_3;

public class ViceGeneralManager extends Hander {
    @Override
    public void handleRequest(int money) {
        if(money<10){
            System.out.println("副总经理审批");
        }else {
            this.successor.handleRequest(money);
        }
    }
}
