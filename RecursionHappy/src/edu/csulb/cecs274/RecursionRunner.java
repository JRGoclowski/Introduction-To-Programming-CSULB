package edu.csulb.cecs274;

import java.util.ArrayList;


public class RecursionRunner {
	
	//Runs the methods properly
	public static void main(String[] args)
	{
		int x = 0;
		boolean happyValue = false;
		Interface ui = new Interface();
		ui.println("Please input a positive integer");
		x = ui.intIn();
		while (x <= 0)
		{
			ui.println("Please input a positive integer.");
			x = ui.intIn();
		}
		happyValue = CheckHappy(x);
		if (happyValue)
		{
			ui.println(x + " is a happy number");
		}
		else
		{
			ui.println(x + " is not a happy number");
		}
	}
	
	public static int SplitNumber(int x)
	{
		if (x<10 && x > 0)
		{
			return (x*x);
		}
		else
		{
			return (SplitNumber(x/10) + 
					/*This section adds the remainder to whatever 
					 * values come out when recurssion ends*/ (x%10)*(x%10));
			
		}
		
	}
	
	public static boolean CheckHappy(int x)
	{
		ArrayList<Integer> completedNumbers = new ArrayList<Integer>();
		//int listIndex = 0;
		while (!completedNumbers.contains(x))
		{
			completedNumbers.add(x);
			x = SplitNumber(x);
			System.out.print(x + " ");
			
			/*
		    for (int i=0; i<completedNumbers.size(); i++) 
		    {
		    	System.out.println(completedNumbers.get(i)+" "); 
		    }*/
			if (x == 1)
			{
				return true;
			}
			
		}
					
		
			return false;
		
	}	
}

