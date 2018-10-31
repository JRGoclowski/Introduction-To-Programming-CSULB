package edu.csulb.cecs274;

public class Main {
	
	private static Interface ui = new Interface();
	
	public static void main(String args[])
	{
		
		
		while(true)
		{
			
		}
		/*{
			ui.print("Please input a roman numeral : ");
			String number = ui.input();
			Numeral test = new Numeral(number);
			ui.println("");
			if (test.isValid())
			{
				ui.println("Valid numeral");
			}
			else
			{
				ui.println("Not a Valid numeral");
			}
			
		}
		/*{
			ui.println("Would you like to (A)dd, (S)ubtract, or (M)ultiply?");
			ui.print("Please input the character in parenthesis of desired operation : ");
			String a[] = new String[] {"A","S","M"};
			String operationChoise = ui.stringIn(a);
			ui.print("Please input the first Roman Numeral : ");
		}*/
		
	}
	
	public int operations(String choice, Numeral firstNumeral, Numeral secondNumeral)
	{
		int answer;
		switch(choice)
		{
		case "A":
			answer = firstNumeral.getValueInt() + secondNumeral.getValueInt();
			
		}
		
		return 1;
	}
}
