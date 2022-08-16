package com.qa.garage;

import java.util.Scanner;

public class Choice {

	private static Scanner sc = new Scanner(System.in);

	public String getInput() {
		System.out.println("Enter CRUD choice: ");
		return sc.nextLine();
	}

	public void options() {
		// create an instance of the CRUD queries class to open the connection
		CRUDqueries q = new CRUDqueries();

		// Ask for user input on the CRUD choice in the getInput method and store the
		// result in the crud variable
		String crud = getInput();

		// try-finally block so the finally block can close the connection
		try {
			// do-while loop to start the loop and present the options to interact with the
			// database
			do {
				// switch case to match which CRUD operation to perform
				switch (crud.toLowerCase()) {
				case "create":
					System.out.println("Enter model: ");
					String mod = sc.nextLine();
					System.out.println("Enter mileage: ");
					int miles = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter vehicle type: ");
					String vType = sc.nextLine();
					System.out.println("Enter doors: ");
					int door = sc.nextInt();
					sc.nextLine();
					q.create(mod, miles, vType, door);
					break;
				case "read":
					// add code to call read method
					break;
				case "update":
					// add code to call update method
					break;
				case "delete":
					// add code to call delete method
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				// check if user wants to continue or break out of the loop
				System.out.println("Would you like to continue? (y/n)");
				String quit = sc.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			q.closeConn();
		}
	}

}
