
public class GenerateIntNo {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			//Random function returns double value between (less than or greater than 0.0) so we have to multiply by any integer no
			//System.out.println("Random Number :" +(int)(Math.random()*10));
			System.out.println((int)(Math.random()*60));
		}
	}

}
