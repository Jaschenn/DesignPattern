package com.jasmine.状态模式;

public class NormalState extends AccountState {
    @Override
    public void stateCheck() {

    }

    @Override
    public void deposit(double amount) {
        System.out.println("取款"+amount+"元");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("存款"+amount+"元");
    }
}
