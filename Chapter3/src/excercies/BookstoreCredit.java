package excercies;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double grade;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter name >> "); 
		name = input.next(); 
		System.out.println("Please enter grade >>"); 
		grade = input.nextDouble(); 
		
		displayCredit(name, grade); 

	}
	public static void displayCredit(String name, double grade)
	{
		double credit = 10; 
		double compute; 
		compute = grade * credit; 
		System.out.println("Hello, " + name + " your credit is " + compute); 
	}

}
