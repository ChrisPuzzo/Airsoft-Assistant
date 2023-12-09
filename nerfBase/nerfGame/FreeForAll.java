package nerfGame;
import java.util.Scanner;
import java.util.ArrayList;

public class FreeForAll implements gameInterface {

	ArrayList<String> playerArray = new ArrayList<String>();
	private static String gameName = "Free for All";
	private int totalPlayers;
	
	Scanner myObj = new Scanner(System.in); // add scanner module to read in commands

	
	@Override
	public void gameRules() {
		System.out.println("Free For All: be the last man standing to win.");
	}

	@Override
	public void addPlayer(String playerID) {
		playerArray.add(playerID);	
	}

	@Override
	public void startGame() {
		System.out.println("Starting Game" + gameName);
		System.out.println("Please add players to the game by inputting their IDs");
		System.out.println("When all players are submitted type 0");
		boolean stop = false;
		while (stop == false)
		{
			System.out.println("Enter player ID:");
		    String id = myObj.nextLine();
		    if (id == "0")
		    {
		    	stop = true;
		    }
		    else
		    {
		    	this.addPlayer(id);
		    }	
		}
		System.out.println(playerArray);
		this.totalPlayers = playerArray.size();
		
	}

	public void elimination(String playerID) {
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
	

}
