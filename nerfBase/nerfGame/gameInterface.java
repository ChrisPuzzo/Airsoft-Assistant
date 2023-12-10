package nerfGame;
import nerfUser.User;

public interface gameInterface {	
	void gameRules(); //displays game rules
	void addPlayer(User player); //add users to game
	void elimination(User player); //registers hits
	void gameGo(); // runs game
	void teamGen(); //generates teams - not priority
}
