package com;
 
public class BucketSortJava {
 
	public static void main(String args[]) {
		int i, a[] = {3, 6, 9, 0, 5, 1, 8, 4, 3, 1}, n = 10;
	    
	    System.out.println("Before sorting:\n");
	    for(i = 0; i < n; ++i)
	        System.out.print(a[i] + " ");
	    
	    bucketSort(a, n);
	    
	    System.out.println("\n\nAfter sorting:\n");
	    for(i = 0; i < n; ++i)
	        System.out.print(a[i] + " ");	
	}
 
	static void bucketSort(int a[], int n) {
	    int i, j, k, SIZE = 10;
	    
	    int buckets[] = new int[SIZE];
	    
	    for(i = 0; i < SIZE; ++i)
	        buckets[i] = 0;
	    
	    for(i = 0; i < n; ++i)
	        ++buckets[a[i]];
	        
	    for(i = 0, j = 0; j < SIZE; ++j)
	        for(k = buckets[j]; k > 0; --k)
	            a[i++] = j;
	}
}
