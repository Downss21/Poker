//Complete this class as much as you can, email me an URL to your PUBLIC repl at end of class

import java.util.Scanner;

public class Player
{
  //instance variables
  private Hand hand;
  private int cash; //Assume whole dollars
  private String name;
  private int playerNumber;

  //Constructor
  public Player(Hand hand, int startingCash, String playerName, int playerNumber)
  {
	  this.hand = hand;
	  this.cash = startingCash;
	  this.name = playerName;
	  this.playerNumber = playerNumber;
  }


  //Methods
  public void makeBet(int amount)
  {
    this.cash -= amount;
  }

  //Fold will be handled by the dealer
  //Moving on to next player will be handled by dealer
  //Dealer will decide who wins, and give winnings

  public void getCash(int amount)
  {
    this.cash += amount;

  }

  public void takeCard(Card c)
  {
    //You write this
    
    //Display players hand to console
    //Ask player which card to replace
    //Set that card
	  Scanner reader = new Scanner(System.in);
	  System.out.println(hand.toString());
	  System.out.println("What card do you want to replace with "+c.toString()+": ");
	  int place = reader.nextInt();
	  hand.setCard(c,place);
  }

  

}