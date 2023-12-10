package nerfUser;
import java.util.ArrayList;
import java.util.Scanner;

public class UserPortal {
	
	static Scanner myObj = new Scanner(System.in);
	static ArrayList<User> currentUsers = new ArrayList<User>();

	
	private static void print(String text) {
		System.out.println(text);
	}
	
	//public String textInput() {
		//return myObj.nextLine();
	//}
	
	private static User regUI(String usern) {
		User newUser = new User(usern);
		return newUser;
	}
	
	private static void displayUser(User user) {
		
	}
	
	public static void main(String[] args) {
		print("Welcome User to the Nerf Battle Companion!");
		print("Menu:");
		print("(1) Log in existing user");
		print("(2) register new user");
		print("(3) Exit");
		while (true)
		{
			String choice = myObj.nextLine().toString();
			if (choice.equals("1")) {
				print("Log in by username");
				
				
				
			}
			else if (choice.equals("2")) {
				System.out.println("Please enter a username");
			    String user = myObj.nextLine();
				currentUsers.add(regUI(user));
				print(currentUsers.get(currentUsers.size() - 1).getUserID());
				
			}
			else if (choice.equals("3")) {
				System.exit(0);
			}
			else {
				print("got diffrerent thing");
				print(choice);
				System.out.print(choice.getClass());
				System.out.print("1".getClass());
			}
		}
	}
	
}