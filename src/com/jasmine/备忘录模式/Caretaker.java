package com.jasmine.备忘录模式;

import java.util.ArrayList;

public class Caretaker
{
	private ArrayList<Memento> mementos = new ArrayList<Memento>();
	public Memento getMemento(int index)
	{
		return mementos.get(index);
	}
	public void setMemento(Memento memento)
	{
		mementos.add(memento);
	}
}