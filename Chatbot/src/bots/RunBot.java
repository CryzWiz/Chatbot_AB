package bots;

import java.io.File;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;

public class RunBot {

	
	private static final boolean TRACE_MODE = false;
	static String botName = "super";
	String resourcesPath = getResourcesPath();
	Bot bot; 
	Chat chatSession;
	
	public RunBot(){
		
		if(bot == null){
			
			bot = new Bot("super", resourcesPath);;
		}
		
		chatSession = new Chat(bot);
		
		bot.brain.nodeStats();
		
	}
	
	public String talkToBot(String comment){
		
		String response = chatSession.multisentenceRespond(comment);
		while (response.contains("&lt;"))
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
