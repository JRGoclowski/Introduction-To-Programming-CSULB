package edu.csulb.cecs274;
import java.util.Random;

//this class creates the deck object, and carries the methods
//that are all the verbs the deck may need to function properly
//such as drawing, shuffling, and counting how many cards are left
public class Deck {
	
	Interface ui = new Interface();
	int Value = 0;
	int Suit = 0;
	String SuitString = "";
	String Rank = "";
	Card deckArray [] = new Card[52];
	Random r = new Random();
	Card hand[] = new Card [12];
	int deckSize = 52;
	
	//Deck Costructor
	public Deck()
	{
		deckSize = 52;
		CreateDeck();
		Shuffle(52);
	}
	
	//Resets the deck when necessary
	public void replaceDeck()
	{
		deckSize = 52;
		CreateDeck();
		Shuffle(52);
	}
	
	//makes the deck by creating every possible card, in order
	public void CreateDeck()
	{
		int cp = 0;
		
		//For each suit 0-3, run loops inside
		for (int i = 0; i < 4; i++)	
			{
				//For each rank in this suit, run the loop inside
				for (int j = 0; j < 13; j++)
				{
					//Create card with current values
					
					deckArray [cp] = new Card(i,j);
					cp += 1; 
					
				}
				
			}
	}
	

	//returns the top card in the deck, reduces the length of the deck
	//and makes the top position in the deck a "null" value
	public Card drawCard()
	{
		Card x = deckArray[deckSize - 1];
		deckArray [deckSize - 1] = null;
		deckSize -= 1;
		return x;
		
	}
	
	//randomizes every card left in the deck
	public void Shuffle(int stackSize)
	{
		for (int i = 0; i <stackSize; i++)
		{
			int deckPosition = r.nextInt(stackSize);
			Card currentCard = deckArray[i];
			deckArray[i] = deckArray [deckPosition];
			deckArray[deckPosition] = currentCard;
			
		}
		
	}	
	
	//returns the card in the deck at the given position
	public Card getCard(int position)
	{
		return deckArray[position];
	}
	
	//counts how many cards are remaining in the deck after cards
	//have been drawn
	public int getStackSize() 
	{
		int c = 0;
		for (int i = 0; i < deckArray.length; i++)
		{
			if (deckArray[i] != null)
			{
				c += 1;
			}
			
		}
		return c;
	}
	
	//returns the decksize
	public int getDeckSize() {
		return deckSize;
	}
	
	//sets the deckSize to the stackSize
	public void setDeckSize(int StackSize) {
		deckSize = StackSize;
	}
	
	//gets the value of the card in the given position of the deck
	public int getValue(int p/*osition*/)
	{
		return deckArray[p].getValue();
	}
	
	//returns the rank of the card in the given position of the deck
	public String getRank(int p/*osition*/)
	{
		return deckArray[p].getRank();
	}
	
}

