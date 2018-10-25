package edu.csulb.cecs274;

public class Main {
	
	private static Interface ui = new Interface();
	
	public static void main(String args[])
	{
		
		while(true)
		{
			ui.print("Please input Roman Numeral : ");
			Numeral a = new Numeral(ui.input());
			ui.println("");
			ui.println(a.getNumString());
			for (int i = 0; i < a.getNumCharArray().length; i++)
			{
				ui.println(a.getNumChar(i));
			}
			
			
					
		}
	}
}
