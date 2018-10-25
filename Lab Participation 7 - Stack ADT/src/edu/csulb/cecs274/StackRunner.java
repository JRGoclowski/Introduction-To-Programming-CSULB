package edu.csulb.cecs274;

public class StackRunner {
	
	private static Interface ui = new Interface();
	private static Stack s = new Stack();
	private static Deck d = new Deck();
	
	
	public static void main(String args[])
	{
		boolean continueRunningBool = true;
		
		
		ui.println("Welcome to Stack Testing Program");
		ui.println("Press any key to start");
		ui.input();
		
		while(continueRunningBool)
		{
			d.replaceDeck();
			ui.println("Pushing:");
			for (int i = 0; i < 5; i++)
			{
				ui.print((i+1) + "- pushing ");
				Card y = d.drawCard();
				y.printCard();
				s.push(y);
				ui.println("");
			}
			
			ui.println("");
			ui.println("Popping:");
			for (int o = 0; o < 5; o++ )
			{
				ui.print((o+1) + "- popping ");
				Card v = s.pop();
				v.printCard();
				ui.println("");
			}
			
			ui.print("Would you like another run?(Y/N) : ");
			String keepPlayingString = ui.input();
			while (!keepPlayingString.toUpperCase().equals("Y") 
					&& !keepPlayingString.toUpperCase().equals("N"))
			{
				ui.println("");
				ui.print("That is not neither Y, nor N. Please input Y or N : ");
				keepPlayingString = ui.input();
			}
			if (keepPlayingString.toUpperCase().equals("N"))
			{
				continueRunningBool = false;
			}
			
		}
		
		ui.println("Thank you and Goodbye");
	}
		
}
