package edu.csulb.cecs274;

public class StackRunner {
	
	private static Interface ui = new Interface();
	private static Stack s = new Stack();
	
	public static void main()
	{
		ui.println("Welcome to Stack Testing Program");
		ui.println("Press any key to start");
		ui.input();
		
		for (int i = 0; i < 5; i++)
		{
			ui.print(i + "- pushing");
			Card y = s.generateCard();
			y.printCard();
			
		}
		
		
	}
}
