package nerfGame;

import java.util.ArrayList;
import java.util.Scanner;
import nerfUser.UserPortal;
import nerfUser.User;

public class GamePortal {
	
	static Scanner myObj = new Scanner(System.in); // add scanner module to read in commands
	static ArrayList<User> regPlayers = UserPortal.arrayAccess();
	
	private static void print(String text) {
		System.out.println(text);
	}
	
	private static FreeForAll ffa() {
		return new FreeForAll(regPlayers);
	}
	
	public static void main(String[] args) {
		print("Choose a game to run");
		print("(1) Free For All");
		print ("More coming later");
		String choice = myObj.nextLine();
		if (choice.equals("1")) {
			FreeForAll game = ffa();
			game.gameGo();
		}
		else {
			print("Game not registered");
			System.exit(0);
		}

//		System.out.println("Starting Game" + game.getGameName());
//		System.out.println("Please add players to the game by inputting their IDs");
//		System.out.println("When all players are submitted type 0");
//		boolean stop = false;
//		while (stop == false)
//		{
//			System.out.println("Enter player ID:");
//		    String id = myObj.nextLine();
//		    if (id == "0")
//		    {
//		    	stop = true;
//		    }
//		    else
//		    {
//		    	this.addPlayer(id);
//		    }	
//		}
//		System.out.println(playerArray);
//		this.totalPlayers = playerArray.size();
		
	}

}
