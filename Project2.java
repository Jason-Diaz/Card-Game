package proj2;
import cardgames.*;
/**
 * Project 2: Working with the Card class
 * 
 * Description: This code tells the computer to draw 3 random cards. The computer displays the cards
 * on a graphic interface. It also determines if there is a pair (two cards of the same value), what the 
 * highest value is, and calculates the sum. If the sum is greater than or equal to 25 the computer
 * displays "Player wins" if not it displays "Computer wins".
 * @author Jason Diaz
 *
 */

public class Project2 {
	public static void main(String[] args)
	{
		GUI theWindow = new GUI();
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		//Card card1 = theDeck.dealCard();
		Card card1 = new Card(31);
		System.out.println("Card 1 is: " + card1.toString());
		//Card card2 = theDeck.dealCard();
		Card card2 = new Card(5);
		System.out.println("Card 2 is: " + card2.toString());
		//Card card3 = theDeck.dealCard();
		Card card3 = new Card(14);
		System.out.println("Card 3 is: " + card3.toString());
		
		theWindow.showCard(card1);
		theWindow.showCard(card2);
		theWindow.showCard(card3);
		
		/*This if statement compares all three card to each other find if there is a pair
		if there is a pair then the screen will display "Pair" if there isn't, "Not a pair"*/
		if (card1.getValue() == card2.getValue())
			 System.out.println("Pair");
		
		else 
			if (card1.getValue() == card3.getValue())
				 System.out.println("Pair");
		
			else
				if (card2.getValue() == card3.getValue())
					System.out.println("Pair");
		
				else
				    System.out.println("Not a pair");
		
		/*This if statement compares the cards to find the highest value. Once that value
		 * is found it will display the value not the suit. I in case there are two cards
		 * that have the same value and whose values are the highest it will still display the value.*/
		if (card1.getValue() >= card2.getValue() && (card1.getValue() >= card3.getValue()))
			 System.out.println("The highest value is " + card1.getValue());
		else 
			if (card2.getValue() >= card1.getValue() && (card2.getValue() >= card3.getValue()))
				 System.out.println("The highest value is " + card2.getValue());
				 else
					 if (card3.getValue() >= card1.getValue() && (card3.getValue() >= card2.getValue()))
						  System.out.println("The highest value is " + card3.getValue());
		
		//Here I created an variable to get the sum of all three cards. Which is then displayed.
		int sum = card1.getPointValue() + card2.getPointValue() + card3.getPointValue(); 
		
		System.out.println("The sum is " + sum);
		/*This if statement determines if the sum is higher than or equal to 25. If it is the computer
		will display "Player wins." if not then it will display "Computer wins." */
		if (sum >= 25)
			 System.out.println("Player wins.");
			 else
				 System.out.println("Computer wins.");
		
		
	}
}