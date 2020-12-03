import java.util.Random;


public class Deck
{
	//[] indicates array, which can hold a collection of Card objects, more on that in a future unit
	private Card[] deck = new Card[52];
	private int deckSize = 52;
	private String[] suits = {"Heart", "Spade", "Diamond", "Club"};
	private Random generator = new Random();


	//Constructor builds std 52 card deck
	public Deck()
	{
		int cardNumber = 0;
		for(int i = 0; i<suits.length; i++)
		{
			for(int j = 1; j <= 13; j++)
			{
				Card c = new Card(j,suits[i]);
				deck[cardNumber] = c;
				cardNumber++;
			}
		}
		shuffle();
	}


	//Public Methods

	//Take card from "bottom" of deck
	public Card getCard()
	{
		deckSize--;
		return deck[deckSize];
	}


	//HELPER METHODS

	//Shuffles the deck
	private void shuffle()
	{
		for(int i = 0; i<deckSize; i++)
		{
			int randomNumber = generator.nextInt(deckSize);
			swap(i, randomNumber);
		}
	}


	//Swaps two cards in the deck
	private void swap(int i, int j)
	{
		Card c = deck[i];
		deck[i] = deck[j];
		deck[j] = c;
	}

}