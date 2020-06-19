package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geeksforgeeks";
		char a[] = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])==null)
			{
				//printing every single character
				System.out.println(a[i]);
				hm.put(a[i],1);
			}
			else
			{
				int value=hm.get(a[i]);
				hm.put(a[i],value+1);
			}
		}
		System.out.println("Printing first Non repeating character");
		for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])==1)
			{
				System.out.println(a[i]+" "+hm.get(a[i]));
				break;
			}
		}
		System.out.println("Curious about HashMap works!");
		for(Map.Entry<Character, Integer> entry :hm.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
