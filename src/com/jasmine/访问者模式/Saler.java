package com.jasmine.访问者模式;
public class Saler extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("����Ա" + name + "��ƻ�����ӣ�Ȼ�������۸�");
	}
	
	public void visit(Book book)
	{
		System.out.println("����Ա" + name + "ֱ�Ӽ�����ļ۸�");
	}
}