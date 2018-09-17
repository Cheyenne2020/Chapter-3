package excercies;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ;
		int y ;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter an x value >> "); 
		x = input.nextInt(); 
		System.out.println("Please enter an y value >> ");
		y = input.nextInt(); 
		
		computePercent(x , y); 

	}
	public static void computePercent(int x, int y)
	{
		int compute;
		
		compute = (x / y) * 100; 
		System.out.println(x + " divided by " + y  + " = " + compute + "%"); 
	}

}
