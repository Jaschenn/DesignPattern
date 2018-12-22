package com.jasmine.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable{
    private String name;
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    @Override
    public int compareTo(Object o) {
        return this.getNo()-((Student)o).getNo();
    }
}
