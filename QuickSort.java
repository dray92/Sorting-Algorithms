package sorting;

import java.util.Arrays;

public class QuickSort {
	
	int[] arr;
	
	public QuickSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = myArr[i];
	}
	
	public String sort() {
		String st = "Before Quick Sort: " + Arrays.toString(arr) + "\n";
		quickSort(0, arr.length-1);
		st += "After Quick Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}

	int partition(int low, int high) {
		int pivot = arr[(low + high) / 2];
	    while (low <= high) {
	    	while (arr[low] < pivot)
	    		low++;
	        while (arr[high] > pivot)
	            high--;
	        if (low <= high) {
	            swap(low, high);
	            low++;
	            high--;
	        }
	    }
	    return low;
	}

	void quickSort(int low, int high) {
		int index = partition(low, high);
		if (low < index - 1)
			quickSort(low, index - 1);
		if (index < high)
			quickSort(index, high);
	}
	
	private void swap(int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
