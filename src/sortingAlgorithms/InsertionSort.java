package sortingAlgorithms;

public class InsertionSort {

	static void sort(int arr[])
	{
		for(int j=1;j<arr.length;j++)
		{
			int key =arr[j];
			int i=j-1;
		    while(i>=0 && arr[i]>key)
		    {
		    	arr[i+1]=arr[i];
		    	i=i-1;
		    }
		    arr[i+1]=key;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,2,1,3,4,8,9,0,6};
		sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
