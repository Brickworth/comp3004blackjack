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
	
	void checkWin() {
		int dealerTotal = 0;
		for (Card k : dealerHand) {
			dealerTotal =+ k.getValue();
		}
		int playerTotal = 0;
		for (Card k : playerHand) {
			playerTotal =+ k.getValue();
		}
		if (playerTotal == 21) {playerWin = true;}
		if (dealerTotal == 21) {dealerWin = true; playerWin = false; return;}
	}
	
	void displayHands() {
		System.out.println("Player has " + playerHand.get(0).getRank() + "of " + playerHand.get(0).getSuit());
		System.out.print(" and " + playerHand.get(1).getRank() + "of " + playerHand.get(1).getSuit());
		System.out.println("Dealer has " + dealerHand.get(0).getRank() + "of " + dealerHand.get(0).getSuit());
		System.out.print(" and an unknown card");
	}
	
	public void dealerHasWon() {
		System.out.println("DEALER WINS, PLAYER HAS LOST");
		while(true);
	}
	
	public void playerHasWon() {
		System.out.println("PLAYER WINS, DEALER HAS LOST");
		while(true);
	}
	
	void playerHits() {
		
	}
	
	void dealerHits() {
		
	}
	
	public void gameStart(char[] fileCharArray) {
		ArrayList parsedArray = parseCharArray(fileCharArray);
		playerHand.add(new Card((char)parsedArray.get(0), (char)parsedArray.get(1)));
		playerHand.add(new Card((char)parsedArray.get(2), (char)parsedArray.get(3)));
		dealerHand.add(new Card((char)parsedArray.get(4), (char)parsedArray.get(5)));
		dealerHand.add(new Card((char)parsedArray.get(6), (char)parsedArray.get(7)));
		displayHands();
		checkWin();
		if (dealerWin) {dealerHasWon();}
		if (playerWin) {playerHasWon();}
		if (parsedArray.size() <= 8) {throw new Error("Need more input from file to continue the game");}
		
		if ((char)parsedArray.get(8) == 'H') {
			playerHand.add(new Card((char)parsedArray.get(9), (char)parsedArray.get(10))); 
		}
		
		else if ((char)parsedArray.get(8) == 'S') {}
	}
	
	public void gameStart() {
		playerHand.add(playingDeck.deal());
		playerHand.add(playingDeck.deal());
		dealerHand.add(playingDeck.deal());
		dealerHand.add(playingDeck.deal());
		displayHands();
	}
}
