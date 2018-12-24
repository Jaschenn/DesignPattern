package com.jasmine.中介者模式;

import java.util.Hashtable;

public class ChatGroupV2 extends AbstractChatroom{
    private Hashtable members=new Hashtable();

    public void register(Member member)
    {
        if(!members.contains(member))
        {
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        if(message.length()>100){
            System.out.println("不能发送");
        }
    }

    public void sendTextWithTime(String from, String to, String message,String time) {
        if(message.length()>100){
            System.out.println("不能发送");
        }else {
            Member member = (Member) members.get(to);
            member.receiveText(from,message+" ---"+time);
        }
    }
    @Override
    public void sendImage(String from, String to, String message) {
        if(message.length()>20){
            System.out.println("不能发送");
        }else{
            Member member = (Member) members.get(to);
            member.receiveImage(from,message);
        }
    }
}
