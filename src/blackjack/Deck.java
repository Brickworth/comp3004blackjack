package blackjack;

import java.util.ArrayList;

public class Deck {
ArrayList<Card> cardList;

	Deck() {
		char[] suitList = {'C', 'S', 'H', 'D'};
		String[] rankList = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		for (char s : suitList) {
			for (String r : rankList) {
				cardList.add(new Card(s, r));
			}
		}
	}
	
	public void shuffle() {
		return;
	}

}
