package sortingAlgorithms;

public class SelectionSort {

	static void sort(int a[]) {
		
		for(int i=0;i<a.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_index])
					min_index=j;
			}
			int temp = a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,8,2,1,4,3};
		
		sort(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

	}

}
