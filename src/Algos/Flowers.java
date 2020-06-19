package geeksforgeeks;

import java.util.Scanner;
import static java.lang.Math.max;

public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int a[][] = new int[rows][columns];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Maximum Sum "+findMaxPath(a,rows,columns));
		
	}
	static int findMaxPath(int mat[][],int r,int c) 
    {  
        int res = -1; 
        for (int i = 0; i <r ; i++) 
            res = max(res, mat[0][i]); 
  
        for (int i = 1; i < r; i++)  
        { 
            res = -1; 
            for (int j = 0; j < c; j++)  
            { 
                // When all paths are possible 
                if (j > 0 && j < c - 1) 
                    mat[i][j] += max(mat[i - 1][j], 
                                 max(mat[i - 1][j - 1],  
                                    mat[i - 1][j + 1])); 
  
                // When diagonal right is not possible 
                else if (j > 0) 
                    mat[i][j] += max(mat[i - 1][j], 
                                    mat[i - 1][j - 1]); 
  
                // When diagonal left is not possible 
                else if (j < c - 1) 
                    mat[i][j] += max(mat[i - 1][j], 
                                mat[i - 1][j + 1]); 
  
                // Store max path sum 
                res = max(mat[i][j], res); 
            } 
        } 
        return res; 
    }   
	

}
