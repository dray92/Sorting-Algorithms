package sorting;

import java.util.Arrays;

public class InsertionSort {

	int[] arr;
	
	public InsertionSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++) 
			arr[i] = myArr[i];
	}
	
	public String sort() {
		String st = "Before Insertion Sort: " + Arrays.toString(arr) + "\n";
		for (int i = 1; i < arr.length; i++) {
			int newValue = arr[i];
			int j = i;
            while (j > 0 && arr[j - 1] > newValue) {
            	arr[j] = arr[j - 1];
            	j--;
	        }
	        arr[j] = newValue;
	    }
		st += "After Insertion Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}
}
