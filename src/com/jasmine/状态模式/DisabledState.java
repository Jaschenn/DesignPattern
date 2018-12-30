package com.jasmine.状态模式;

public class DisabledState extends AccountState {
    @Override
    public void stateCheck() {

    }

    @Override
    public void deposit(double amount) {
        System.out.println("账户已经被冻结了，暂时无法存款");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账户已经被冻结了，暂时无法取款");
    }
}
