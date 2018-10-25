package edu.csulb.cecs274;

import java.util.Random;

public class Stack {

	//private Random r = new Random();
	Interface ui = new Interface(); 
	private int maximumStackSize = 50;
	//private Card topCard;
	private int stackSize;
	private Card deck[] = new Card[maximumStackSize];
	
	
	
	public Stack()
	{
		stackSize = 0;
	}
	
	public boolean isEmpty()
	{
		return true;
	}
	
	public boolean push(Card x)
	{
		if (stackSize >= maximumStackSize)
		{
			ui.println("STACK OVERFLOW");
			return false;
		}
		
		else
		{
			deck[++stackSize] = x;
			return true;
		}
	}
	
	public Card pop()
	{
		if (stackSize < 0)
		{
			ui.println("STACK UNDERFLOW");
			return null;
		}
		else
		{
			Card x = deck [stackSize--];
			return x;
		}
	}
	
	/*public Card generateCard()
	{
		int n = r.nextInt(12) + 1;
		int s = r.nextInt(3);
		Card x = new Card(s,n);
		/*for (int i = 0; i < deck.length; i++)
		{
			Card test = new Card(s,n);
			
			try
			{
				if (deck[i].getRank().equals(test.getRank()) && deck[i].getSuit().equals(test.getSuit()))
				{
					while(deck[i].getRank().equals(test.getRank()) && deck[i].getSuit().equals(test.getSuit()))
					{
						n = r.nextInt(13) + 1;
						s = r.nextInt(3);
						test = new Card(s,n);
					}
					
				}
			}
			catch (NullPointerException e)
			{
				continue;
			}
			
		}
		
		push(x);
		return x;
	}*/
	
	
}
