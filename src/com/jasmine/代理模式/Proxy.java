package com.jasmine.代理模式;

public class Proxy {
    private Target target;
    int age;
    public Target findTarget(){
        if(this.age<18){
            System.out.println("不可以早恋");
            return null;
        }else {
            return new Target();
        }
    }

    public Proxy(Single single) {
        this.age = single.age;
    }
}
