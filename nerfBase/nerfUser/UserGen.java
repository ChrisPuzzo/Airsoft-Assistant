package nerfUser;
import java.util.Scanner;

public class UserGen {
	Scanner myObj = new Scanner(System.in);
	
	private User createUser(String username) {
		return new User(username);
		
	}
	
	public User regUI() {
		System.out.println("Please enter a username");
	    String user = myObj.nextLine();
		User newUser = this.createUser(user);
		return newUser;
	}
}
