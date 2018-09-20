package blackjack;

import java.util.ArrayList;

public class Game {
	
	Deck playingDeck;
	ArrayList<Card> dealerHand;
	ArrayList<Card> playerHand;
	public boolean dealerWin = false;
	public boolean playerWin = false;
	
	Game(){
		playingDeck = new Deck();
		playingDeck.shuffle();
		dealerHand = new ArrayList<Card>();
		playerHand = new ArrayList<Card>();
	}
	
	ArrayList parseCharArray(char[] array) {
		ArrayList returnList = new ArrayList();
		for (char c : array) {
			if (c != ' ' && (int)c != 0) {
				// Character is valid
				returnList.add(c);
			}
		}
		return returnList;
	}
	
	int checkWin() {
		// Returns 1 if player has won, 2 if dealer has won, 0 if neither has won
		int dealerTotal = dealerHand.get(0).getValue() + dealerHand.get(1).getValue();
		int playerTotal = playerHand.get(0).getValue() + playerHand.get(1).getValue();
		if ()
		return 0;
	}
	
	void displayHands() {
		System.out.println("Player has " + playerHand.get(0).getRank() + "of " + playerHand.get(0).getSuit());
		System.out.print(" and " + playerHand.get(1).getRank() + "of " + playerHand.get(1).getSuit());
		System.out.println("Dealer has " + dealerHand.get(0).getRank() + "of " + dealerHand.get(0).getSuit());
		System.out.print(" and an unknown card");
	}
	
	public void gameStart(char[] fileCharArray) {
		ArrayList parsedArray = parseCharArray(fileCharArray);
		playerHand.add(new Card((char)parsedArray.get(0), (char)parsedArray.get(1)));
		playerHand.add(new Card((char)parsedArray.get(2), (char)parsedArray.get(3)));
		dealerHand.add(new Card((char)parsedArray.get(4), (char)parsedArray.get(5)));
		dealerHand.add(new Card((char)parsedArray.get(6), (char)parsedArray.get(7)));
		displayHands();
		
	}
	
	public void gameStart() {
		playerHand.add(playingDeck.deal());
		playerHand.add(playingDeck.deal());
		dealerHand.add(playingDeck.deal());
		dealerHand.add(playingDeck.deal());
		displayHands();
	}
}
