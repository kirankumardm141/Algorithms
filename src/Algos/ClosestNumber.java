package geeksforgeeks;

import java.util.Scanner;

public class ClosestNumber {

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int a[]= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int diff=10000000,index=0;
		    for(int i=0;i<n;i++)
		    {
		        if(Math.abs((x-a[i]))<=diff)
		        {
		            diff =Math.abs(x-a[i]);
		            index=i;
		        }
		    }
		    System.out.println(a[index]);
		    t--;
		}
	}

}
