package edu.csulb.cecs274;

import java.util.NoSuchElementException;

public class Queue {
	
	//TODO remove static
	static int headIndex,tailIndex;
	static char[] queueArray = new char[50];//TODO remove declaration of length
	
	
	public Queue(int size)
	{
		queueArray = new char[size];
		headIndex = 0;
		tailIndex = 1;
	}
	
	//TODO Remove this
	public static void main (String[] args)
	{
		Interface ui = new Interface();
		
		while(true)
		{
			ui.print("enqueue, dequeue, peek, head index, tail index");
			String response = ui.input();
			
			if (response.equals("e"))
			{
				ui.print("input enqueue :");
				char x = ui.charIn();
				enqueue(x);
				continue;
			}
			if (response.equals("d"))
			{
				ui.println(dequeue());
				continue;
			}
			if (response.equals("p"))
			{
				ui.println(peek());
				continue;
			}
			if (response.equals("hi"))
			{
				ui.println(headIndex);
				continue;
			}
			if (response.equals("ti"))
			{
				ui.println(tailIndex);
				continue;
			}
		}
	}	
		
	public char head()
	{
		if (!isEmpty())
		{
			return queueArray[headIndex];
		}
		else
		{
			throw new NoSuchElementException("No Head Character Exception");
		}
		
	}


	public static char peek() //TODO remove static
	{
		if (headIndex == tailIndex)
		{
			throw new NoSuchElementException("No Next Character");
		}
		else
		{
		return queueArray[headIndex];
		}
		
	}
	
	public static char dequeue() //TODO remove static 
	{
		/*if (headIndex == tailIndex)
		{
			throw new NoSuchElementException("Array Underflow");
		}*/
		char x = queueArray[headIndex];
		headIndex++;
		return x;
		
	}
	
	public static void enqueue(char addition) //TODO remove static usage
	{
		queueArray[tailIndex++] = addition;
	}
	
	public boolean isEmpty()
	{
		if (headIndex == tailIndex)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getHeadIndex() {
		return headIndex;
	}


	public int getTailIndex() {
		return tailIndex;
	}
	
}
