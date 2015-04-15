package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	int[] arr;
	
	public SelectionSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++) 
			arr[i] = myArr[i];
	}
	
	public String sort() {
		String st = "Before Selection Sort: " + Arrays.toString(arr) + "\n";
		for(int i = 0 ; i < arr.length-1 ; i++)
			for(int j = i+1 ; j < arr.length ; j++)
	            if(arr[i] > arr[j])
	                 swap(i, j);
		st += "After Selection Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}

	private void swap(int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;		
	}
}
