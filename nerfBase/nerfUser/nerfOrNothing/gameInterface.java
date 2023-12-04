package nerfOrNothing;

public interface gameInterface {
	private int playerNumbers;
	private String[] playerArray;
	private void gameRules(); //displays game rules
	private void addPlayers(); //add users to game
	public void startGame(); //starts the game
	private void elimination(); //registers hits
	private void teamGen(); //generates teams - not priority
}
