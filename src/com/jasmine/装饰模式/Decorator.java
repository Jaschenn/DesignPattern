package com.jasmine.装饰模式;

public class Decorator extends Phone {
    private Phone phone;
    public Decorator(Phone phone){
        this.phone=phone;
    }

    public void remind() {
        phone.remind();
    }
}
