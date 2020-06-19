package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,4,3,2,1};
		int n =arr.length;
		
		//Bubble Sort
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
        System.out.println("Sorted Elements");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}

}
