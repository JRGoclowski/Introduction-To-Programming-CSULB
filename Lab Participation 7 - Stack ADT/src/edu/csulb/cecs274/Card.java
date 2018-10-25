package edu.csulb.cecs274;

public class Card {
		
	//A card has variables Value, Suit, and Rank
	private int Value = 0;
	/*Suits: 
	0 - clubs
	1 - diamonds
	2 - hearts
	3 - spades
	*/
	private int Suit = 0;
	private String rankOptions[] = new String []{"Ace", "2", "3", "4", "5", "6","7","8","9","10","Jack","Queen","King"} ;
	private String Rank = "2";
	
	//Card constructor, assigning rank and suit, as value can be determined by rank.
	public Card (int sui, int r)
	{
		Suit = sui;
		Rank = rankOptions[r];
		Value = CardValue(Rank);
	}
	
	//Determines the value of the card by passing the rank
	public int CardValue(String r)
	{
		if (r.equals("Ace"))
		{
			Value = 11;
		}
		else if (r.equals("Jack") || r.equals("Queen") || r.equals("King"))
		{
			Value = 10;
		}
		else
		{
			Value = Integer.parseInt(r);
		}
		
		return Value;
	}
	
	//returns the value of the card
	public int getValue() {
		return Value;
	}
	
	//sets the value of the card based (unused)
	/*public void setValue(int value) {
		Value = value;
	}*/
	
	//returns the suit of the card
	public String getSuit() 
	{
		
		int si = Suit;
		String SuitString = "";
		if (si == 0 )
		{
			SuitString  = "Clubs";
		}
		else if (si == 1)
		{
			SuitString = "Diamonds";
		}
		else if (si == 2)
		{
			SuitString = "Hearts";
		}
		else if (si == 3)
		{
			SuitString = "Spades";
		}
		
		return SuitString;
	}
	//returns the rank of the card
	public String getRank() 
	{
		return Rank;
	}
	
	public void printCard()
	{
		System.out.println( Rank + " of " + this.getSuit());
	}

}


