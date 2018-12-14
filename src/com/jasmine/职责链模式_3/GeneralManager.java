package com.jasmine.职责链模式_3;

public class GeneralManager extends Hander {
    @Override
    public void handleRequest(int money) {
        if(money<20){
            System.out.println("总经理审批");
        }else {
            System.out.println("需要召开职工大会确定");
        }
    }
}
