//This program will calculate the perimeter and area of various classrooms at Grand Circus based on user input

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {

		// Outputs introduction line for the program
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		// Sets up length and width numbers entered by user
		Scanner scan = new Scanner(System.in);
		char answer;
		//char answer2;
		String hello;
		
		//Sets up do while loop
		do {
		
		// Asks user for prompts 
		System.out.print("Enter Length: ");
		double length = scan.nextDouble();
		
		System.out.print("Enter Width: ");
		double height = scan.nextDouble();
		
		// Calculates and outputs the area of the rectangle
		double area = length * height;
		System.out.println("Area: " + area);
		
		// Calculates and outputs the perimeter of the rectangle
		double perimeter = (length * 2) + (height * 2);
		System.out.println("Perimeter: " + perimeter);

		// Garbage line to clear up Scanner
		scan.nextLine();
		
		// Asks user to continue or end the program
		System.out.println("Continue? (Y/N): " );
		answer = scan.nextLine().charAt(0);
		//answer2 = answer.charAt(0);

		} while (answer == 'Y' || answer == 'y');
		
		
	}

}
