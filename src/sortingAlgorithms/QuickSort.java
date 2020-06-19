package sortingAlgorithms;

public class QuickSort {

	static int partition(int a[],int low,int high)
	{
		int pivot = a[high];
		int i= (low-1);
		for(int j=low;j<high;j++)
			{
				if(a[j]<=pivot)
				{
					i++;
					int temp= a[i];
					a[i] =a[j];
					a[j]=temp;
				}
			}
			int temp =a[i+1];
			a[i+1]=a[high];
			a[high]=temp;
		
		return i+1;
	}
	
	static void sort(int a[],int low,int high)
	{
		if(low<high)
		{
			int p = partition(a,low,high);
			
			sort(a,low,p-1);
			sort(a,p+1,high);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {52,5,10,20,45,3,1,26,12};
		int n =a.length;
		sort(a, 0, n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
