package com.jasmine.装饰模式;

public class ComplexPhone extends Decorator {

    public ComplexPhone(Phone phone) {
        super(phone);
    }
    public void remind(){
        super.remind();
        this.flash();
        this.vibrate();
    }

    public void vibrate(){
        System.out.println("震动！");
    }
    public void flash(){
        System.out.println("发光！");
    }
}
