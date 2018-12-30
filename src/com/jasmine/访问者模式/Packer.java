package com.jasmine.访问者模式;

public class Packer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("打包员打包苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("打包员打包书本");
    }
}
