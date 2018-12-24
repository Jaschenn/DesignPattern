package com.jasmine.中介者模式;

public class CommonMember extends Member
{
	public CommonMember(String name)
	{
		super(name);
	}
	
	public void sendText(String to,String message)
	{
	    System.out.println("��ͨ��Ա������Ϣ��");
	    chatroom.sendText(name,to,message);  //����
	}
	
	public void sendImage(String to,String image)
	{
		System.out.println("��ͨ��Ա���ܷ���ͼƬ��");
	}
}