package geeksforgeeks;

import java.util.Scanner;

public class NextGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		char[] c = ("" + a).toCharArray();
		int i;
		for(i=c.length-1;i>0;i++)
		{
			if(c[i]>c[i+1])
				break;;
		}
		
	}

}
