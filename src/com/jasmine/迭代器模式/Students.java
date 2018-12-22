package com.jasmine.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> list = new ArrayList<Student>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Students(List<Student> list) {
        this.list = list;
    }

    public Students() {
    }
    public void addStudent(Student student){
        list.add(student);
    }
    public StudentIterator getIterator(){
        return new StudentIterator(this.list);
    }
}
