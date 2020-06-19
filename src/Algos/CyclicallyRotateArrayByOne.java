package geeksforgeeks;

import java.util.Scanner;

public class CyclicallyRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
		    int N= sc.nextInt();
		    int a[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int last=a[N-1];
		    StringBuffer sb = new StringBuffer();
		    sb.append(last);
		    for(int i=0;i<N-1;i++)
		    {
		        sb.append(" "+a[i]);
		    }
		    System.out.println(sb);
		    t--;
		}

	}

}
