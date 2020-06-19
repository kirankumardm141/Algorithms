package geeksforgeeks;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0)
        {
            int N = in.nextInt();
            int D = in.nextInt();
            int a[]= new int[N];
            for(int i=0; i<N; i++)
            {
               a[i] = in.nextInt();
            }
            StringBuffer s = new StringBuffer();
            for(int i=D; i<N; i++ )
            {
                s.append(a[i]+" ");
            }
            for(int i=0;i<D;i++)
            {
                s.append(a[i]+" ");
            }
            test--;
            System.out.println(s);
        }
		
	}

}
