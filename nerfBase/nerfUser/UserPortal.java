package nerfUser;

import java.util.Scanner;

public class UserPortal {
	
	Scanner myObj = new Scanner(System.in);

	
	private void print(String text) {
		System.out.println(text);
	}
	
	private String textInput() {
		return myObj.nextLine();
	}
	
	public void main() {
		this.print("Welcome User to the Nerf Battle Companion!");
		this.print("Menu:");
		this.print("(1) Log in existing user");
		this.print("(2) register new user");
		this.print("(3) Exit");
		String choice = this.textInput();
		if (choice == "1") {
			this.print("Log in by username");
		}
		if (choice == "2") {
			UserGen newUser = new UserGen();
			newUser.regUI();
		}
		if (choice == "3") {
			System.exit(0);
		}
		
	}
	
}
