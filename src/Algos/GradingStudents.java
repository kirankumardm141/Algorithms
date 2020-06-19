package geeksforgeeks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
	    int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<38)
				System.out.println(a[i]);
			else
			{
				double s=(a[i])/5;
				s=Math.ceil(s+1);
				int d =(int)s*5;
				if((d-a[i])<3)
					System.out.println(d);
				else
					System.out.println(a[i]);
			}
		}
		
	}   
}
