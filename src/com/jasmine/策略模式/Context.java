package com.jasmine.策略模式;

public class Context {
    private AbstractWay abstractWay;

    public AbstractWay getAbstractWay() {
        return abstractWay;
    }

    public void setAbstractWay(AbstractWay abstractWay) {
        this.abstractWay = abstractWay;
    }
    public void play(){
        this.abstractWay.play();
    }
}
