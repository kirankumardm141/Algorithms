package geeksforgeeks;

import java.util.Scanner;

public class SmallestSubArray {
	
	
	static int SmallestSubArrayLength(int a[],int n,int k) {
		
		int start=0,end =0,curr_sum=0,min_len = n+1;
		
		while(end<n)
		{
			if(curr_sum <= k && end<n)
			{
				curr_sum= curr_sum +a[end];
				end++;
			}
			while(curr_sum > k && start < n)
			{
				if(end-start <min_len)
					min_len =end-start;
				
				curr_sum= curr_sum-a[start];
				start++;
			}	
		}
		return min_len;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		int res = SmallestSubArrayLength(a, n, k);
		if(res==n+1)
			System.out.println("Not Possible !");
		else
			System.out.println("Smallest SubArray Length is "+ res);

	}

}
