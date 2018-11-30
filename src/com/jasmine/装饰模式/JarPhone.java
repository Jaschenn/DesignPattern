package com.jasmine.装饰模式;

public class JarPhone extends Decorator {
    public JarPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void remind() {
        super.remind();
        this.vibrate();
    }
    public void vibrate(){
        System.out.println("震动！");
    }

}
