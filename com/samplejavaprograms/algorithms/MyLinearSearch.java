package com.samplejavaprograms.algorithms;

/*Linear search or sequential search is a method for finding a particular value in a list, that consists of checking every one of its elements, one at a time and in sequence, until the desired one is found.
Linear search is the simplest search algorithm. For a list with n items, the best case is when the value is equal to the first element of the list, in which case only one comparison is needed. The worst case is when the value is not in the list (or occurs only once at the end of the list), in which case n comparisons are needed.
The worst case performance scenario for a linear search is that it has to loop through the entire collection, either because the item is the last one, or because the item is not found. In other words, if you have N items in your collection, the worst case scenario to find an item is N iterations. In Big O Notation it is O(N). The speed of search grows linearly with the number of items within your collection.
Linear searches don't require the collection to be sorted*/


public class MyLinearSearch {
      
	 public static int doLinearSearch(int[] arr, int key) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		 return -1;
	 }
	
	public static void main(String[] args) {
		//MyLinearSearch mls = new MyLinearSearch();
		int[] arr1 = {21,4,5,14,80,92,44} ;
		int searchKey = 44; 
		System.out.println("Key value " +searchKey+ " is found at array index "+doLinearSearch(arr1, searchKey));
		int[] arr2 = {21,56,88,4,5,14,80,92,44} ;
		int searchKey2 = 92; 
		System.out.println("Key value " +searchKey2+ " is found at array index "+doLinearSearch(arr2, searchKey2));
	
	}
}
