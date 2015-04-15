package sorting;

import java.util.Arrays;

public class MergeSort {
	
	int[] arr;
	
	public MergeSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++) 
			arr[i] = myArr[i];
	}
	
	public String sort() {
		String st = "Before Merge Sort: " + Arrays.toString(arr) + "\n";
		sort(arr);
		st += "After Merge Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}

	private void sort(int[] arr) {
		if(arr.length > 1) {
			// splitting the array
			int[] left = leftArray(arr);
			int[] right = rightArray(arr);
			
			// recursively sorting the two halves
			sort(left);
			sort(right);
			
			// merge the sorted halves
			merge(arr, left, right);
		}
		
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0;   // index into left array
		int i2 = 0;   // index into right array
		
		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1];    // take from left
				i1++;
			} else {
				result[i] = right[i2];   // take from right
				i2++;
			}
		}
	}

	private int[] rightArray(int[] arr) {
		int size = arr.length - (arr.length/2);
		int[] right = new int[size];
		for (int i = 0; i < size; i++) {
            right[i] = arr[i + arr.length/2];
        }
        return right;
	}

	private int[] leftArray(int[] arr) {
		int size = arr.length / 2;
		int[] left = new int[size];
		for (int i = 0; i < size; i++) {
            left[i] = arr[i];
        }
        return left;
	}
}
