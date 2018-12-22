package com.jasmine.迭代器模式;

import java.util.*;

public class StudentIterator {
    private int currentIndex = 0;
    Iterator<Student> studentIterator = null;
    private List list = null;
    public StudentIterator(List list){
        this.studentIterator=list.iterator();
        this.list = list;
    }
    public boolean hasNext(){
        if(studentIterator.hasNext()){
            return true;
        }
        return false;
    }
    public Collection getByOrder(boolean order){
        if(order==true){
            //从大到小
            Collections.sort(list, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return 1;
                }
            });
            return list;
        }else {
            Collections.sort(list,new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return -1;
                }
            });
            return list;
        }
    }
}
