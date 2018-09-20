package blackjack;

public class Card {
	String suit;
	int value;
	String rank;
	
	Card(char sui, char num) {
		switch (sui) {
			case 'C':
				suit = "Clubs";
				break;
			case 'S':
				suit = "Spades";
				break;
			case 'H':
				suit = "Hearts";
				break;
			case 'D':
				suit = "Diamonds";
				break;
			default:
				throw new Error("Invalid suit character provided!");
				
		}
		
		switch (num) {
			case 'A':
				// set value to 99 for now
				value = 11;
				rank = "Ace";
				break;
			case 'K':
				value = 10;
				rank = "King";
				break;
			case 'Q':
				value = 10;
				rank = "Queen";
				break;
			case 'J':
				value = 10;
				rank = "Jack";
				break;
			case 'T':
				value = 10;
				rank = "10";
				break;
			default:
				value = num - '0';
				rank = String.valueOf(num);
				if (value > 9 || value <= 0) {
					throw new Error("Invalid card type provided!");
				}
				break;
		}
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
}
