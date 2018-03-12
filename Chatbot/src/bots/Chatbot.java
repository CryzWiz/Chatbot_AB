package bots;

/**  mars 2018
 * Chatbot class
 * 
 * Class holding all the different methods for AB program. 
 * For now we only use multisentenceRespond, witch simply put
 * means -> Chat.
 * @author allan
 *
 */

import java.io.File;
import java.util.Scanner;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;

public class Chatbot {

	private static final boolean TRACE_MODE = false;
	static String botName = "super";
	public String resourcesPath = getResourcesPath();
	public Bot bot; 
	public Chat chatSession;
	
	public Chatbot(){		
		if(bot == null){
			
			this.bot = new Bot(botName, resourcesPath);
			this.chatSession = new Chat(bot);
			MagicBooleans.trace_mode = TRACE_MODE;
			bot.brain.nodeStats();
		}	
	}
	
	public String talkToBot(String comment){
		
		if (MagicBooleans.trace_mode)
			System.out.println("STATE=" + comment + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0) + ":TOPIC=" + chatSession.predicates.get("topic"));
		String response = chatSession.multisentenceRespond(comment);
			response = response.replace("&lt;", "<");
		while (response.contains("&gt;"))
			response = response.replace("&gt;", ">");
		return response;
		
	}

	private String getResourcesPath() {
		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		path = path.substring(0, path.length() - 2);
		System.out.println(path);
		String resourcesPath = path + File.separator + "src" + File.separator;/*+ "main" + File.separator + "resources"*/
		return resourcesPath;
	}
}
