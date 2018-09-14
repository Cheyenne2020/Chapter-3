package excercies;

import java.util.Scanner;

public class TestIbls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pounds; 
		Scanner input = new Scanner(System.in); 
		System.out.println("How much do you weigh? >> "); 
		pounds = input.nextInt(); 
		
		
		displayPoundsToKilos(pounds); 
		displayPoundsToOunces(pounds); 
		displayPoundsToMilligrams(pounds); 
	}
	public static void displayPoundsToKilos(int pounds)
	{
		double kilos;   
		kilos = pounds * (1 / 2.2 ); 
		System.out.println("In kilos you weigh " + kilos); 
	}
	public static void displayPoundsToOunces(int pounds)
	{
		int ounces;
		ounces = pounds * 16; 
		System.out.println("In ounces you weigh " + ounces); 
		
	}
	public static void displayPoundsToMilligrams(int pounds)
	{
		double milligrams; 
		milligrams = pounds * 453592.37; 
		System.out.println("In milligrams you weigh " + milligrams); 
	}

}
