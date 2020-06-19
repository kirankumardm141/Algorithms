package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[][] = {{"jerry","65"},
                        {"bob","91"},
                        {"jerry","23"},
                        {"Eric","83"}};
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0;i<s.length;i++)
		{
			if(hm.get(s[i][0])==null)
				hm.put(s[i][0],Integer.parseInt(s[i][1]));
			else
			{
				int avg = hm.get(s[i][0]);
				hm.put(s[i][0],(avg+Integer.parseInt(s[i][1]))/2);
			}
		}
		
		double average = Double.MIN_VALUE;
		String name="";
		for(Map.Entry<String, Integer> entry : hm.entrySet())
		{
			if(entry.getValue() > average)
			{
				name = entry.getKey();
				average = entry.getValue();
			}
		}
		System.out.println(name+" "+average);
		
	}

}
