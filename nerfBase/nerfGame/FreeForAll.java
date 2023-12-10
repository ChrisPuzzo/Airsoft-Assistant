package nerfGame;
import java.util.Scanner;
import nerfUser.User;
import java.util.ArrayList;

public class FreeForAll implements gameInterface {

	ArrayList<User> playerArray = new ArrayList<User>(); // Houses players who are playing the game
	private static String gameName = "Free for All";
	private int totalPlayers;
	static ArrayList<User> playersReg; // Houses all registered players

	
	Scanner myObj = new Scanner(System.in); // add scanner module to read in commands

	private static void print(String text) {
		System.out.println(text);
	}
	
	public FreeForAll(ArrayList<User> playerArray) {
		print("welcome to free for all");
		gameRules();
		playersReg = playerArray;		
	}
	
	private static void genTestUsers() {
		playersReg.add(new User("Chris"));
		playersReg.add(new User("Nick"));
		playersReg.add(new User("Ohkami"));
		playersReg.add(new User("Jonas"));
		
	}
	
	public void gameGo() {
		print("Add players");
		String choice = "1";
		genTestUsers();
		while(choice.equals("0") != true) {
			print("Enter a userName to add them to the game");
			print("When you are done type 0");
			boolean found = false;
			choice = myObj.nextLine();
			for (int i = 0; i < playersReg.size(); i++) {
				User player = playersReg.get(i);
				if (player.getUserName().equals(choice)){
					print("Checking...");
					addPlayer(player);
					print(player.getUserName() + " Added");
					player.playGame();
					found = true;
					break;
				}
			
			}
			if (found==false && choice.equals("0")!=true) {
				print("name not found. Please try again");
			}
		}
		print("all players added");
		gameRules();
		print(playerArray.size()+"");
		while (playerArray.size() > 1) {
			print("record player deaths by entering their usernames");
			String death = myObj.nextLine();
			print("record the player who eliminated this player");
			String elim = myObj.nextLine();
			for (int i = 0; i < playerArray.size(); i++) {
				User currPlayer = playerArray.get(i);
				if ((currPlayer.getUserName()).equals(death)) {
					dead(currPlayer);
				}
				else if ((currPlayer.getUserName().equals(elim))) {
					currPlayer.elimination();
				}
				print(playerArray.size()+"");
			}
		}
		User winner = playerArray.get(0);
		print("The Winner is " + winner.getUserName()+ "!");
		winner.win();
		print("Thanks for Playing");
		playerArray.clear();
		playersReg.clear();
		System.exit(0);
		
	}
	
	@Override
	public void gameRules() {
		System.out.println("Free For All: be the last man standing to win.");
	}


	@Override
	
	public void dead(User playerID) {
		playerArray.remove(playerID);
		playerID.death();
		
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
