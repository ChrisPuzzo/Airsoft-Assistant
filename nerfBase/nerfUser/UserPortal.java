package nerfUser;
import java.util.ArrayList;
import java.util.Scanner;

public class UserPortal {
	
	static Scanner myObj = new Scanner(System.in);
	static ArrayList<User> currentUsers = new ArrayList<User>();

	
	private static void print(String text) {
		System.out.println(text);
	}
	
	private static String textInput() {
		return myObj.nextLine();
	}
	
	private static User regUI(String usern) {
		User newUser = new User(usern);
		return newUser;
	}
	
	public static void main(String[] args) {
		print("Welcome User to the Nerf Battle Companion!");
		print("Menu:");
		print("(1) Log in existing user");
		print("(2) register new user");
		print("(3) Exit");
		String choice = textInput();
		if (choice == "1") {
			print("Log in by username");
		}
		if (choice == "2") {
			System.out.println("Please enter a username");
		    String user = myObj.nextLine();
			currentUsers.add(regUI(user));
		}
		if (choice == "3") {
			System.exit(0);
		}
		
	}
	
}