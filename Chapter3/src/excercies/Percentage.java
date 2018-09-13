package excercies;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 12;
		
		computePercent(x , y); 

	}
	public static void computePercent(int x, int y)
	{
		int compute;
		
		compute = (x / y) * 100; 
		System.out.println(x + " divided by " + y  + " = " + compute + "%"); 
	}

}
