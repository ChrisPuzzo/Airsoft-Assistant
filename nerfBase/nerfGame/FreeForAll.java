package nerfGame;
import java.util.Scanner;


public class FreeForAll implements gameInterface {

	private String[] playerArray;
	private static String gameName = "Free for All";
	private int totalPlayers;
	
	Scanner myObj = new Scanner(System.in); // add scanner module to read in commands

	
	@Override
	public void gameRules() {
		
	}

	@Override
	public void addPlayer(String playerID) {
		// TODO Auto-generated method stub
		
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
		    	this.playerArray[0] = id;
		    }	
		}
		this.setTotalPlayers(playerArray.length);
		
	}

	@Override
	public void elimination(String playerID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teamGen() {
		// TODO Auto-generated method stub
		
	}

	public String[] getPlayerArray() {
		return playerArray;
	}

	public void setPlayerArray(String[] playerArray) {
		this.playerArray = playerArray;
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
