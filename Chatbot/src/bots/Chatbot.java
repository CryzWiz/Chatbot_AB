package bots;

import java.io.File;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;
public class Chatbot {

	private static final boolean TRACE_MODE = false;
	static String botName = "super";

	public static void main(String[] args) {
		
		RunBot bot = new RunBot();
		
		//String test = bot.TalkToBot("Test");
		
		System.out.println(bot.talkToBot("Hi, my name is Allan. What is your name?"));
	}

}
