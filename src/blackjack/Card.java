package blackjack;

public class Card {
	String suit;
	int value;
	
	Card(char sui, String num) {
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
			case "Ace":
				// do nothing for now
				break;
			case "King":
				value = 10;
				break;
			case "Queen":
				value = 10;
				break;
			case "Jack":
				value = 10;
				break;
			default:
				value = Integer.parseInt(num);
				if (value > 10 || value <= 0) {
					throw new Error("Invalid card type provided!");
				}
				break;
		}
	}
}
