package com.jasmine.中介者模式;

public class PlasticMember extends Member{
    public PlasticMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("塑料会员发送消息,不添加时间");
        chatroom.sendText(this.name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("塑料会员发送图片");
        chatroom.sendImage(this.name,to,image);
    }

    public void sendTextWithTime(String to,String message,String time){
        System.out.println("塑料会员发送消息,添加时间");
        chatroom.sendTextWithTime(this.name,to,message,time);
    }
}
