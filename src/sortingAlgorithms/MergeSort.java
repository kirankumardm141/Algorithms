package sortingAlgorithms;

public class MergeSort {

	static void merge(int arr[],int l,int m,int r) {
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarray array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
	}
	
	static void mergesort(int a[],int p,int r) {
		
		if(p<r)
		{
			int q=(p+r)/2;
			
			mergesort(a, p, q);
			mergesort(a, q+1, r);
			merge(a,p,q,r);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,5,4,3,2,54,25,23};
		int n =a.length;
		
		mergesort(a, 0, n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
