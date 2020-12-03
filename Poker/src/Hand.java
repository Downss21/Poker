
public class Hand
{
  private Card c1;
  private Card c2;
  private Card c3;
  private Card c4;
  private Card c5;

  public Hand(Card c1, Card c2, Card c3, Card c4, Card c5)
  {
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
    this.c4 = c4;
    this.c5 = c5;
  }

  //We need a way to discard "old" cards
  public void setCard(Card c, int position)
  {
    if(position == 1)
    {
      c1 = c;  //What happens to the old card? Garbage collected
    }
    else if(position == 2)
    {
      c2 = c;
    }
    else if(position == 3)
    {
      c3 = c;
    }
    else if(position == 4)
    {
      c4 = c;
    }
    else if(position == 5)
    {
      c5 = c;
    }
  }

  //toString method -> give all data as CSV
  public String toString()
  {
    String str = "Card 1: " + c1.toString() + ", " + "Card 2: " + c2.toString() + ", " + "Card 3: " + c3.toString() + ", " + "Card 4: " + c4.toString() + ", " + "Card 5: " + c5.toString();
    return str;
  }



}