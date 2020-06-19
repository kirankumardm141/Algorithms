package geeksforgeeks;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int arrSize = sc.nextInt();
		    int a[]= new int[arrSize];
		    for(int i=0;i<arrSize;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    // Hash map which will store the 
	        // elements which has appeared previously. 
		    HashMap<Integer,Boolean> mp = new HashMap<>(); 

		    for (int i = 0; i < arrSize; ++i) 
		    { 

		    	// Print the element if it is not 
		    	// there in the hash map 
		    	if (mp.get(a[i]) == null) 
		    		System.out.print(a[i] + " "); 
		    	//else
		    	// Insert the element in the hash map 
		    		mp.put(a[i], true); 
            }
		    System.out.println();
		    System.out.println("HashMap Values : ");
		    for (Integer key : mp.keySet()) {
				System.out.print(key+" ");
			}
		    
		    System.out.println();
		   
//		    LinkedHashSet<Integer> set= new LinkedHashSet<>();
//		    
//		    for(int i=0;i<arrSize;i++)
//		    {
//		    	set.add(a[i]);
//		    }
//		    
//		    System.out.print(set);
//		    System.out.println();
		    t--;
		}

	}

}
