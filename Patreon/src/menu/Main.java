package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main();

	}
	
	public Main() {
		String tempUsername;
		try {
			System.out.print("Enter username: ");
			tempUsername = scan.nextLine();
			
			ArrayList<User> userList = new ArrayList<>();
		} catch (Exception e) {
			System.out.println("Username must be a string of characters!");
		}
	}
}