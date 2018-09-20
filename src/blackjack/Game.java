package blackjack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	Deck playingDeck;
	ArrayList<Card> dealerHand;
	ArrayList<Card> playerHand;
	
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
	
	public void gameStart(char[] fileCharArray) {
		ArrayList parsedArray = parseCharArray(fileCharArray);
		playerHand.add(new Card((char)parsedArray.get(0), (char)parsedArray.get(1)));
		playerHand.add(new Card((char)parsedArray.get(2), (char)parsedArray.get(3)));
		dealerHand.add(new Card((char)parsedArray.get(4), (char)parsedArray.get(5)));
		dealerHand.add(new Card((char)parsedArray.get(6), (char)parsedArray.get(7)));
	}
	
	public void gameStart() {	
	}
}
