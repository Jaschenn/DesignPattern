package com.jasmine.状态模式;

public abstract class AccountState {
    public abstract void stateCheck();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
