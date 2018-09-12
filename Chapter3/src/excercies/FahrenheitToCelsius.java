package excercies;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Tempeture;
		Scanner input = new Scanner(System.in); 
		System.out.println("What is the tempeture at 8? >>");
		Tempeture = input. nextDouble(); 
		
		dailyTemp(Tempeture); 

	}
	public static void dailyTemp(double Tempeture)
	{
		double celsius;
		celsius = ( Tempeture - 32) *.5556; 
		
		System.out.println("The tempeture in celsius at 8:00pm is " + celsius); 
	}

}
