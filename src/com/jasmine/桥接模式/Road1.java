package com.jasmine.桥接模式;

public class Road1 extends Abstraction {

    public Road1(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void roadBuild() {
        System.out.println("水泥路");
        implementor.busBuild();
    }
}
