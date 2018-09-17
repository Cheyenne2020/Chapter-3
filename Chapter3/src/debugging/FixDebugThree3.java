package debugging;
//This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name;
	      name = getName;
	      displayGreeting(name); 

	}
	public static String getName()
	{
		String name;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter name ");
	      name = input.nextLine();
	      return name;
	}
	 public static void displayGreeting(int name)
	{
		 System.out.println("Hello, " + name + "!");
	}

}
