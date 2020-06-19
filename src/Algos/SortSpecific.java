package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortSpecific {

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    ArrayList<Integer> even =  new ArrayList<>();
		    ArrayList<Integer> odd =  new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		    	if(a[i]==0)
		    		even.add(a[i]);
		    	else if((a[i])%2==0)
		    		even.add(a[i]);
		    	else
		    		odd.add(a[i]);
		    }
		    Collections.sort(odd,Collections.reverseOrder());
		    Collections.sort(even);
		    for(int i=0;i<odd.size();i++)
		    {
		    	System.out.print(odd.get(i)+" ");
		    }
		    for(int i=0;i<even.size();i++)
		    {
		    	System.out.print(even.get(i)+" ");
		    }
		    System.out.println();
		    t--;
		}
	}
}
