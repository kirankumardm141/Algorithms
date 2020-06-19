package test;

import java.util.Arrays;

public class ArraysMergingAndSorting {

	public static void main(String[] args) {
		char a[] = {'a','c','d','f','g'};
		char b[] = {'e','b','h'};
		
		StringBuilder sb = new StringBuilder(64);
		sb.append(a);
		sb.append(b);

		char result[] = sb.toString().toCharArray();
		
		Arrays.sort(result);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	}
}
