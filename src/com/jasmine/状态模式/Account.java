package com.jasmine.状态模式;

public class Account {
    private AccountState accountState;
    private String owner;

    public Account(AccountState accountState, String owner) {
        this.accountState = accountState;
        this.owner = owner;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
    public void deposit(double amount){
        this.accountState.deposit(amount);
    }
    public void withdrwa(double amount){
        this.accountState.withdraw(amount);
    }
}
