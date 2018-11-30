package com.jasmine.桥接模式;

public class Road2 extends Abstraction{
    public Road2(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void roadBuild() {
        System.out.println("沥青路");
        implementor.busBuild();
    }
}
