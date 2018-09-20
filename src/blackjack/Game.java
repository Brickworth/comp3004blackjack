package blackjack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Game {
	
	public static void gameStart(char mode, char[] fileCharArray) {
		Deck playingDeck = new Deck();
		playingDeck.shuffle();
	}
	
	public static String getInput(Scanner scann) {
		return scann.nextLine();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to");
		System.out.println(".------..------..------..------..------..------..------..------..------.");
		System.out.println("|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |");
		System.out.println("| :(): || :/\\: || (\\/) || :/\\: || :/\\: || :(): || (\\/) || :/\\: || :/\\: |");
		System.out.println("| ()() || (__) || :\\/: || :\\/: || :\\/: || ()() || :\\/: || :\\/: || :\\/: |");
		System.out.println("| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|");
		System.out.println("`------'`------'`------'`------'`------'`------'`------'`------'`------'");
		System.out.println("Please type 'c' for console input, or 'f' for file input");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String inputOption = getInput(scan);
			
			if (inputOption.equals("c")) {
				gameStart('c', null);
				break;
			}
			
			if (inputOption.equals("f")) {
				System.out.print("Please type the filename (it must be in the project directory!)\n");
				String filename = getInput(scan);
				char[] fileChars = new char[20];
				try (FileReader fis = new FileReader(filename)) {
				    fis.read(fileChars);
				    fis.close();
				    gameStart('f', fileChars);
				    break;
				} catch (IOException e) {
					System.out.println("File error, please try a different file");
					System.out.println("Please type 'c' for console input, or 'f' for file input");
				}
			}
			
			else {
				System.out.println("Please type either 'c' or 'f'");
			}
		}
		
	}
}
