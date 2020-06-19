package geeksforgeeks;

public class PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10000;
		int pow =1;
		while(pow<x)
			pow= pow*10;

		if(pow==x)
			System.out.println("Power of 10");
		else
			System.out.println("Not a power of 10");

	}

}
