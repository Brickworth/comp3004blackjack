package blackjack;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class BlackjackTests {

	@Test
	void testCardCreation() {
		// Create 6 of spades
		Card card1 = new Card('S','6');
		assertTrue(card1.value == 6);
		assertTrue(card1.suit == "Spades");
		// Create ace of clubs
		Card card2 = new Card('C','A');
		assertTrue(false); //Temporary test
		assertTrue(card2.suit == "Clubs");
		// Create queen of hearts
		Card card3 = new Card('H','Q');
		assertTrue(card3.value == 10);
		assertTrue(card3.suit == "Hearts");
		// Create 10 of diamonds
		Card card4 = new Card('D','T');
		assertTrue(card4.value == 10);
		assertTrue(card4.suit == "Diamonds");
	}
	
	@Test
	void deckCreation() {
		// Create the standard deck of playing cards
		Deck playingDeck = new Deck();
		assertTrue(playingDeck.cardList.size() == 52);
	}

	@Test
	void shuffleTest() {
		// Check if deck is shuffled
		Deck playingDeck = new Deck();
		Deck shuffledDeck = playingDeck;
		shuffledDeck.shuffle();
		assertTrue(playingDeck.cardList != shuffledDeck.cardList);
	}

	@Test
	void playerCardShownTest() throws FileNotFoundException, IOException {
		// Check if player is shown their cards
		char[] fileChars = new char[20];
		try (FileReader fis = new FileReader("input1.txt")) {
		    fis.read(fileChars);
		    fis.close();
		}
		Game gameObject = new Game();
		gameObject.gameStart(fileChars);
		System.console().readLine();
		assertTrue(System.console().readLine() == "Player has King of Spades and Queen of Hearts");
	}
	
	@Test
	void dealerCardShownTest() throws FileNotFoundException, IOException {
		// Check if player is shown dealer's one visible card
		char[] fileChars = new char[20];
		try (FileReader fis = new FileReader("input1.txt")) {
		    fis.read(fileChars);
		    fis.close();
		}
		Game gameObject = new Game();
		gameObject.gameStart(fileChars);
		System.console().readLine();
		assertTrue(System.console().readLine() == "Dealer has Queen of Spades and an unknown card");
	}
	
	@Test
	void initialBlackjackDealer() throws FileNotFoundException, IOException {
		// Check if dealer has an initial blackjack
		char[] fileChars = new char[20];
		try (FileReader fis = new FileReader("input2.txt")) {
		    fis.read(fileChars);
		    fis.close();
		}
		Game gameObject = new Game();
		gameObject.gameStart(fileChars);
		assertTrue(gameObject.dealerWin);
	}
	
	@Test
	void initialBlackjackPlayer() throws FileNotFoundException, IOException {
		// Check if dealer has an initial blackjack
		char[] fileChars = new char[20];
		try (FileReader fis = new FileReader("input2.txt")) {
		    fis.read(fileChars);
		    fis.close();
		}
		Game gameObject = new Game();
		gameObject.gameStart(fileChars);
		assertTrue(gameObject.playerWin);
	}
	
}
