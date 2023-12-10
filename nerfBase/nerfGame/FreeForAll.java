package nerfGame;
import java.util.Scanner;
import nerfUser.User;
import java.util.ArrayList;

public class FreeForAll implements gameInterface {

	ArrayList<User> playerArray = new ArrayList<User>(); // Houses players who are playing the game
	private static String gameName = "Free for All";
	private int totalPlayers;
	ArrayList<User> playersReg = new ArrayList<User>(); // Houses all registered players

	
	Scanner myObj = new Scanner(System.in); // add scanner module to read in commands

	private static void print(String text) {
		System.out.println(text);
	}
	
	public FreeForAll(ArrayList<User> playerArray) {
		print("welcome to free for all");
		gameRules();
		playersReg = playerArray;		
	}
	
	public void gameGo() {
		print("Add players");
		String choice = "1";
		while(choice.equals("0") != true) {
			print("Enter a userID to add them to the game");
			print("When you are done type 0");
			choice = myObj.nextLine();
			for (int i = 0; i < playersReg.size(); i++) {
				User player = playersReg.get(i);
				if (player.getUserID().equals(choice)){
					addPlayer(player);
				}
			}
				
		}
		
	}
	
	@Override
	public void gameRules() {
		System.out.println("Free For All: be the last man standing to win.");
	}


	@Override
	
	public void elimination(User playerID) {
		playerArray.remove(playerID);
		
	}

	@Override
	public void teamGen() {
		System.out.println("There are no teams in this game");
		
	}

	public static String getGameName() {
		return gameName;
	}

	public int getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}

	@Override
	public void addPlayer(User playerID) {
		playerArray.add(playerID);
		
	}
	

}
