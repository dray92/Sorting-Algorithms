package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	int[] arr;
	
	public BubbleSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++) 
			arr[i] = myArr[i];		
	}
	
	public String sort() {
		String st = "Before Bubble Sort: " + Arrays.toString(arr) + "\n";
		for(int i = 1 ; i < arr.length - 2 ; i++) 
			for(int j = 0 ; j < arr.length-i ; j++) 
				if(arr[j] > arr[j+1]) 
					swap(j, j+1);
		st += "After Bubble Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}

	private void swap(int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;		
	}
}
