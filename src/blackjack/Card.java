package blackjack;

public class Card {
	String suit;
	int value;
	
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
				value = 99;
				break;
			case 'K':
				value = 10;
				break;
			case 'Q':
				value = 10;
				break;
			case 'J':
				value = 10;
				break;
			case 'T':
				value = 10;
				break;
			default:
				value = num - '0';
				if (value > 9 || value <= 0) {
					throw new Error("Invalid card type provided!");
				}
				break;
		}
	}
}
