package test;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a[]=s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])==null)
				hm.put(a[i],1);
			else
			{
				int value = hm.get(a[i]);
				hm.put(a[i], value+1);
			}
		}

		for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])==1)
			{
				System.out.println("First non Repeating Character "+a[i]);
				break;
			}
		}
	}

}
