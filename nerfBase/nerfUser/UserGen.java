package nerfUser;

import java.util.Scanner;

public class UserGen {
	Scanner myObj = new Scanner(System.in);
	
	private void createUser(String username, String password) {
		User newUser = new User(username);
	}
	
	public void regUI() {
		System.out.println("Please enter a username");
	    String user = myObj.nextLine();
		System.out.println("Enter a password:");
	    String pass = myObj.nextLine();
		this.createUser(user, pass);
	}
}
