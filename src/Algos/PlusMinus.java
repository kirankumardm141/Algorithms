package geeksforgeeks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int n = arr.length;
    	double plus=0,minus=0,zero=0;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]>0)
    			plus++;
    		else if(arr[i]<0)
    			minus++;
    		else
    			zero++;
    	}
    	plus=plus/n;
    	minus=minus/n;
    	zero=zero/n;
    	System.out.format("%.6f %.6f %.6f ",plus,minus,zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}