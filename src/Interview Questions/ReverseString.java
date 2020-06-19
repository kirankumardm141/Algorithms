package test;

import java.util.*; 
  
// Class of ReverseString 
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        String input = sc.next();
  
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
    } 
} 
