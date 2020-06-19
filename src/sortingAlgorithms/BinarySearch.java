package sortingAlgorithms;

public class BinarySearch {

	static int Search(int a[],int l,int r,int x) {
		
		int mid= (l+r)/2;
		if(a[mid]==x)
			return mid;
		else if(a[mid]>x)
			return Search(a, l, mid-1, x);
		else if(a[mid]<x)
			return Search(a, mid+1, r, x);
		return -1;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,9,10,11,12};
		int n= a.length;
		int x=11;
		int result=BinarySearch.Search(a, 0, n, x);
		if(result == -1)
			System.out.println("Element not found !");
		else
			System.out.println("Element found at index "+result);	
	}

}
