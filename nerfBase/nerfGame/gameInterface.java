package nerfGame;

public interface gameInterface {	
	
	
	void gameRules(); //displays game rules
	void addPlayer(String playerID); //add users to game
	void startGame(); //starts the game
	void elimination(String playerID); //registers hits
	void teamGen(); //generates teams - not priority
}
