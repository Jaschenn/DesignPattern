package com.jasmine.适配器模式;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Dog implements DogAdapter{
    public void yeal(){
        System.out.println("汪汪汪");
    }
}
