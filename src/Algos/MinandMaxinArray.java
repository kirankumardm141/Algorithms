package geeksforgeeks;

import java.util.Scanner;

public class MinandMaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int arrSize= sc.nextInt();
			int a[]= new int[arrSize];
			for(int i=0;i<arrSize;i++)
			{
				a[i]=sc.nextInt();
			}
			int min=a[0];
			for(int i=1;i<arrSize;i++)
			{
		       if(a[i]<min)
		       {
		    	   min=a[i];
		       }
			}
			System.out.print(min+" ");
			int max=a[0];
			for(int i=1;i<arrSize;i++)
			{
		       if(a[i]>max)
		       {
		    	   max=a[i];
		       }
			}
			System.out.print(max+" ");
			System.out.println();
			t--;
		}

	}

}
