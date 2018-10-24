package edu.csulb.cecs274;

import java.util.*;

public class Queue {
	Node head, tail;
	
	public Queue()
	{
		head = new Node();
		head.next = new Node();
		tail = head.next;
	}
	
	public char headCharacter()
	{
		if (!isEmpty())
		{
			return head.data;
		}
		else 
		{
			throw new NoSuchElementException("No Head Character Exception");
		}
	}
	
	public char nextCharacter()
	{
		if (head.next == tail)
		{
			throw new NoSuchElementException("No Next Character");
		}
		else
		{
			return head.next.data;
		}
		
	}
	
	public char dequeue()
	{
		if (head.next == tail)
		{ 
			throw new NoSuchElementException("Not enough links for chain");
		}
		char x = head.data;
		if (head.next.next == tail)
		{
			head = tail;
			head.next = new Node();
			tail = head.next;
		}
		else
		{
			head = head.next;
		}
		
		return x;
		
	}
	
	public void addToQueue(char addition)
	{
		tail.data = addition;
		tail.next = new Node();
		tail = tail.next;
		
	}
	
	public boolean isEmpty()
	{
		return head.next == tail;
	}
	
}
