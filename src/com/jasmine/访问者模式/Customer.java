package com.jasmine.访问者模式;
public class Customer extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("�˿�" + name + "ѡƻ����");
	}
	
	public void visit(Book book)
	{
		System.out.println("�˿�" + name + "���顣");
	}
}