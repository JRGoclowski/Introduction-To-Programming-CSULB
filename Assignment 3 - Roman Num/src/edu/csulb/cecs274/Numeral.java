package edu.csulb.cecs274;

public class Numeral {
	
	private String numString;
	private int valueInt;
	private char[] numChar;
	private Stack numStack;
	private Queue numQueue;
	
	public Numeral(String rNumeral)
	{
		numString = rNumeral;
		valueInt = 1;
		numChar = split(numString); 
	}
	
	private char[] split(String numeral)
	{
		int l = numeral.length();
		char[] sl = new char[l];
		for (int i = 0; i < l; i++)
		{
			sl[i] = numeral.charAt(i);
		}
		return sl;
		
	}
	
	private void convertToStack()
	{
		
	}
	
	private void convertToQueue()
	{
		
	}
	private String toRomanStack()
	{
		return "I";
	}
	
	private int toArabicStack()
	{
		return 1;
	}
	
	private String toRomanQueue()
	{
		return "I";
	}
	
	private int toArabicQueue()
	{
		return 1;
	}
	
	
	public String getNumString() {
		return numString;
	}

	public int getValueInt() {
		return valueInt;
	}

	public char[] getNumCharArray() {
		return numChar;
	}
	
	public char getNumChar(int index)
	{
		return numChar[index];
	}
}
