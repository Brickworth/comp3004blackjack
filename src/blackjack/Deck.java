package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
ArrayList<Card> cardList;
int drawnIndex = 0;

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
		Collections.shuffle(cardList);
	}
	
	public Card deal() {
		Card drawnCard = cardList.get(drawnIndex);
		drawnIndex++;
		return drawnCard;
	}

}
