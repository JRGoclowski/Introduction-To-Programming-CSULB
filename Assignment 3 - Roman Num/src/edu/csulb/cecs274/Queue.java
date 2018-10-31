package edu.csulb.cecs274;

import java.util.NoSuchElementException;

public class Queue {
	
	int headIndex,tailIndex;
	char[] queueArray;
	
	
	public Queue(int size)
	{
		queueArray = new char[size];
		headIndex = 0;
		tailIndex = 1;
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
	
	


	public char peek()
	{
		if (headIndex == tailIndex)
		{
			throw new NoSuchElementException("No Next Character");
		}
		else
		{
		return queueArray[headIndex + 1];
		}
		
	}
	
	public char dequeue()
	{
		/*if (headIndex == tailIndex)
		{
			throw new NoSuchElementException("Array Underflow");
		}*/
		char x = queueArray[headIndex];
		headIndex++;
		return x;
		
	}
	
	public void enqueue(char addition)
	{
		queueArray[++tailIndex] = addition;
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
