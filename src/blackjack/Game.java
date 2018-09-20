package blackjack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
			
			else if (inputOption.equals("f")) {
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
				    File file = fc.getSelectedFile();
				    char[] fileChars = null;
				    try (FileReader fis = new FileReader(file)) {
				        fis.read(fileChars);
				        gameStart('f', fileChars);
				        break;
				    } catch (IOException e) {
						System.out.println("File error, please try a different file");
						System.out.println("Please type 'c' for console input, or 'f' for file input");
					}
				}
			}
			else {
				System.out.println("Please type either 'c' or 'f'");
			}
		}
	}
}
