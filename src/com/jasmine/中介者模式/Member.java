package com.jasmine.中介者模式;

public abstract class Member
{
	protected AbstractChatroom chatroom;
	protected String name;
	
	public Member(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public AbstractChatroom getChatroom()
	{
		return chatroom;
	}
	
    public void setChatroom(AbstractChatroom chatroom)
    {
    	this.chatroom=chatroom;
    }
	
	public abstract void sendText(String to,String message);
	public abstract void sendImage(String to,String image);

    public void receiveText(String from,String message)
    {
    	System.out.println(from + "发文字消息给" + this.name + "内容是：" + message);
    }
    
    public void receiveImage(String from,String image)
    {
    	System.out.println(from + "发图片消息给" + this.name + "内容是：" + image);
    }	
}