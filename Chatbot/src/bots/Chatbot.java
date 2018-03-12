package bots;

public class Chatbot {

	public static void main(String[] args) {
		
		RunBot bot = new RunBot();
		
		//String test = bot.TalkToBot("Test");
		
		System.out.println(bot.talkToBot("Hi, my name is Allan. What is your name?"));
	}

}
