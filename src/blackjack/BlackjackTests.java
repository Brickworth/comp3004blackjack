package blackjack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlackjackTests {

	@Test
	void testCardCreation() {
		// Create 6 of spades
		Card card1 = new Card('S',"6");
		assertTrue(card1.value == 6);
		assertTrue(card1.suit == "Spades");
		// Create ace of clubs
		Card card2 = new Card('C',"A");
		assertTrue(card1.value == 6);
		assertTrue(card1.suit == "Spades");
		// Create queen of hearts
		Card card3 = new Card('H',"Q");
		assertTrue(card1.value == 6);
		assertTrue(card1.suit == "Spades");
		// Create 10 of diamonds
		Card card4 = new Card('D',"10");
		assertTrue(card1.value == 6);
		assertTrue(card1.suit == "Spades");
	}

}
