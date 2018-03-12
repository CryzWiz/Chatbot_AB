package bots;
import java.util.Scanner;

/** mars 2018
 * RunBot
 * Simple program to start a bot and hold a conversation going.
 * 
 * @author allan
 *
 */

public class RunBot {

	public static void main(String[] args) {
		// Create a new bot	
		Chatbot bot = new Chatbot();
		// For as long as the program runs, wait for new comment
		// and print the reply
		while(true){
			System.out.print("Human : ");
			Scanner scanner = new Scanner(System.in);
			String sentence = scanner.next();
			String response = bot.talkToBot(sentence);
			System.out.println("Robot : " + response);
		}
	}
}
