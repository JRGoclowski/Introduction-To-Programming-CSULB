package edu.csulb.cecs274;

public class Stack {

	Interface ui = new Interface();
	private int maximumStackSizeInt = 150;
	private char topChar;
	private int stackSizeInt;
	private char[] stack;
	
	
	
	
	public Stack()
	{
		stackSizeInt = 0;
	}
	
	public boolean isEmpty()
	{
		return true;
	}
	
	public boolean push(char x)
	{
		if (stackSizeInt >= maximumStackSizeInt)
		{
			ui.println("STACK OVERFLOW");
			return false;
		}
		
		else
		{
			stack[++stackSizeInt] = x;
			return true;
		}
	}
	
	public int getStackSizeInt() {
		return stackSizeInt;
	}

	public void setStackSizeInt(int stackSizeInt) {
		this.stackSizeInt = stackSizeInt;
	}

	public char pop()
	{
		if (stackSizeInt < 0)
		{
			ui.println("STACK UNDERFLOW");
			return 'a';
		}
		else
		{
			topChar = stack[stackSizeInt--];
			return topChar;
		}
	}
			
}