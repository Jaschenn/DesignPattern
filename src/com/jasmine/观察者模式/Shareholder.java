package com.jasmine.观察者模式;

public class Shareholder {
    private String name;

    public void afterRise(){
        System.out.println(this.name+"->"+"购买股票");
    }

    public void afterDecrease(){
        System.out.println(this.name+"-->"+"大哭一场😢😢😢😢😢😢😢😢😢");
    }
    public Shareholder() {
    }

    public Shareholder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
