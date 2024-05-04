import java.util.*;

public class Main{
	public static void main(String args[]){
		Deck deck= new Deck();
		System.out.println("_________Creating Deck_________");
		deck.createDeck();
		System.out.println("_______Printing Deck________");
		deck.printDeck();
		System.out.println("_______Shuffling Deck________");
		deck.shuffleDeck();
		System.out.println("_______Printing Shuffled Deck________");
		deck.printDeck();
		
		System.out.println("_______Printing Card________");
		deck.showCard();
		
		
	}
	
}
		