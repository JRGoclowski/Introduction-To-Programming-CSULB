package edu.csulb.cecs274;

public class Numeral {
	
	private String numString;
	private int valueInt;
	private char[] numChar;
	private Stack numStack;
	private Queue numQueue;
	private boolean valid;
	
	public Numeral(String rNumeral)
	{
		numString = rNumeral;
		numChar = new char[rNumeral.length()];
		numChar = split(numString);
		checkValidity();
		if (valid)
		{
			numQueue = new Queue(numChar.length);
			convertToQueue();
			toArabicQueue(numQueue);
		}
		
	}
	
	public Numeral(int Arabic)
	{
		 numStack = toRomanStack(Arabic);
		 numChar = split(numString);
		 valueInt = Arabic;
	}
	
	private void checkValidity()
	{
		char currentChar, nextChar, thirdChar, fourthChar;
		for (int i = 0; i <numChar.length; i++)
		{
			 currentChar = numChar[i];
			
			if (i+1< numChar.length)
			{
				 nextChar =  numChar[i+1];
			}
			else
			{
				 nextChar = 'R';
			}
			if (i+2< numChar.length)
			{
				 thirdChar = numChar[i+2];
			}
			else
			{
				 thirdChar = 'R';
			}
			if (i+3< numChar.length)
			{
				fourthChar = numChar[i+3];
			}
			else
			{
				fourthChar = 'R';
			}

			//Checks if character is a valid Numeral unit
			if(value(currentChar) == 0)
			{
				valid = false;
			}
			
			//Checks if only powers of 10 repeated
			if(value(currentChar) == value (nextChar)
					&& (currentChar == 'V' || currentChar == 'L'|| currentChar == 'D' ))
			{
				valid = false;
			}
			
			//checks if more than three characters are used in a row
			if(value(currentChar) == value(nextChar) 
					&& value(nextChar) == value(thirdChar) 
					&& value(thirdChar) == value(fourthChar))
			{
				valid = false;
			}
			
			//checks if an improper ordering of characters is used
			if((value(currentChar) < value(nextChar)) 
					&& (!(currentChar == 'I' || currentChar =='X' || currentChar =='C') 
					|| ((value(nextChar)/value(currentChar) > 10))))
			{
				valid = false;
			}
			
		}
		
		valid = true;
	}
	
	private int value(char x) 
    { 
        if (x == 'I') 
            return 1; 
        if (x == 'V') 
            return 5; 
        if (x == 'X') 
            return 10; 
        if (x == 'L') 
            return 50; 
        if (x == 'C') 
            return 100; 
        if (x == 'D') 
            return 500; 
        if (x == 'M') 
            return 1000; 
        return 0; 
    }
	
	private void toArabicStack(Stack numeral) 
	    { 
	        int totalCount = 0; 
	  
	        for (int i=0; i<numeral.getStackSizeInt(); i++) 
	        { 
	             
	            int currentCharInt = value(numeral.pop()); 
	  
	            
	            if (i+1 <numeral.getStackSizeInt()) 
	            { 
	                char nextChar = numeral.pop();
	            	int nextCharInt = value(nextChar); 
	  
	                // Comparing both values 
	                if (currentCharInt >= nextCharInt) 
	                { 
	                    totalCount = totalCount + currentCharInt;
	                    numeral.push(nextChar);
	                } 
	                else
	                { 
	                    totalCount = totalCount + nextCharInt - currentCharInt;  
	                } 
	                
	            } 
	            else
	            { 
	            	totalCount = totalCount + currentCharInt;
	                //i++;
	            	//TODO check if this is necessary
	            } 
	        } 
	  
	        valueInt = totalCount; 
	    } 
	
	private void toArabicQueue(Queue numeral)
	{ 
        int totalCount = 0; 
  
        for (int i=0; i<numeral.getTailIndex(); i++) 
        { 
             
            int currentCharInt = value(numeral.dequeue()); 
  
            
            if (i+1 < numeral.getTailIndex()) 
            { 
                char nextChar = numeral.peek();
            	int nextCharInt = value(nextChar); 
  
                // Comparing both values 
                if (currentCharInt >= nextCharInt) 
                { 
                    totalCount = totalCount + currentCharInt;
                } 
                else
                { 
                    totalCount = totalCount + nextCharInt - currentCharInt;
                    numeral.dequeue();
                } 
                
            } 
            else
            { 
            	totalCount = totalCount + currentCharInt;
                //i++;
            	//TODO check if this is necessary
            } 
        } 
        	
        valueInt = totalCount; 
    } 
	
	private Stack toRomanStack(int num) //done

	{
		char[] romanChar = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
		
		Stack numeralTemp = new Stack();
		Stack numeral = new Stack();
		numString = "";
		
		for (int i = 0; i < romanChar.length; i++) 
			{
				int placeValue = num / value(romanChar[i]);
				if (placeValue == 0) continue;
				if (placeValue == 4 && i > 0) 
				{
					numeralTemp.push(romanChar[i+2]);
					numeralTemp.push(romanChar[i]);
					numString += romanChar[i+2] + romanChar[i];
				}
				else
				{
					for (int j = 0; j< placeValue; j++)
					{
						numeralTemp.push(romanChar[i]);
						numString +=romanChar[i];
					}
				}
				
				num = num % value(romanChar[i]);
			}
		for (int k = 0; k < numeralTemp.getStackSizeInt(); k++)
		{
			numeral.push(numeralTemp.pop());
		}
		return numeral;
	}

	private Queue toRomanQueue(int num)//May not be effective 
	{
		char[] romanChar = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
		
		Queue numeral = new Queue(num/*+1?*/);
	
		 
		for (int i = 0; i < romanChar.length; i++) 
			{
				int placeValue = num / value(romanChar[i]);
				if (placeValue == 0) continue;
				if (placeValue == 4 && i > 0) 
				{
					numeral.enqueue(romanChar[i+2]);
					numeral.enqueue(romanChar[i]);
				}
				else
				{
					for (int j = 0; j< placeValue; j++)
					{
						numeral.enqueue(romanChar[i]);
					}
				}
				
				num = num % value(romanChar[i]);
			}
		return numeral;
	}
	
	
	private char[] split(String numeral)
	{
		int l = numeral.length();
		char[] sl = new char[l];
		numeral = numeral.toUpperCase();
		for (int i = 0; i < l; i++)
		{
			sl[i] = numeral.charAt(i);
		}
		return sl;
		
	}
	
	private void convertToStack()
	{
		numStack = new Stack();
		for (int i = numChar.length; i > 0; i++)
		{
			numStack.push(numChar[i]);
		}
	}
	
	
	private void convertToQueue()
	{
		numQueue = new Queue(numChar.length);
		for (int i = 0; i < numChar.length; i++)
		{
			numQueue.enqueue(numChar[i]);
		}
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
	
	public boolean isValid() {
		return valid;
	}
	
}
