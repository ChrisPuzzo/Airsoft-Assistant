package nerfUser;

// The user class used to house the user details 
public class User {
	
	private String userName;
	private String userID;
	private int wins;
	private int elims;
	private int gamesPlayed;
	private double winPercent;
	private double kd;
	
	// Constructor
	public User(String usern) 
	{
		userName = usern;
		genUserID();
		wins = 0;
		elims = 0;
		gamesPlayed = 0;
		genWinPer();
		genKd();
	}
	
	public static void user(String[] args)
	{
		User player = new User("input");
	}
	
	// Generate Random UserID
	private void genUserID(){
		double dig;
		String digStr;
		dig = Math.random() * Math.pow(10,16);
		digStr = String.valueOf(dig);
		setUserID(digStr);
	}
	
	private void genKd() {
		double newKd;
		newKd = this.elims/this.gamesPlayed;
		setKd(newKd);
	}
	
	private void genWinPer()
	{
		double winPer;
		winPer = this.winPercent/this.gamesPlayed;
		setWinPercent(winPer);
	}
	
	public void win()
	{
		setWins(getWins() + 1);
		genKd();
	}
	
	public void elimination()
	{
		setElims(getElims() + 1);
		genWinPer();
	}
	
	
	// Getter for userName
	// Don't want to be able to change username
	public String getUserName() {
		return userName;
	}
	
	// Getter and Setter for userID
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	// Getter and Setter for getWins
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}

	// Getter and Setter for elims
	public int getElims() {
		return elims;
	}

	public void setElims(int elims) {
		this.elims = elims;
	}
	
	// Getter and Setter for gamesPlayed
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	
	// Getter and Setter for winPercent
	public double getWinPercent() {
		return winPercent;
	}

	public void setWinPercent(double winPercent) {
		this.winPercent = winPercent;
	}
	
	// Getter and Setter for getKd
	public double getKd() {
		return kd;
	}

	public void setKd(double kd) {
		this.kd = kd;
	}
	
	
	
}
