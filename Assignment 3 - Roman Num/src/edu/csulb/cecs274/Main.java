package edu.csulb.cecs274;

public class Main {
	
	private static Interface ui = new Interface();
	
	public static void main(String args[])
	{
		while(true)
		{
			ui.print("Please input A, B, Or C : ");
			ui.println("");
			String[] list = new String["A","B","C"];
			String x = ui.stringIn([]);
			String response = new String(new char[x]).replace('\0', 'V');
			ui.print(response);
		}
		
		/*while(true)
		{
			ui.print("Please input array length : ");
			ui.println("");
			int x = ui.intIn();
			Queue q = new Queue(x);
			boolean continueBool = true;
			while (continueBool)
			{
				ui.print("Input desired character addition : ");
				char y = ui.charIn();
				q.enqueue(y);
				ui.println("Add another?y/n");
				String answer = ui.input();
				if (answer.equals("y"))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			ui.println(q.head());
			for (int i = 0; i < q.tailIndex +1; i++) 
			{
				ui.println(q.dequeue());
			}
			
					
		}*/
	}
}
