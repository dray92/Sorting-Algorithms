package sorting;

import java.util.Arrays;

public class HeapSort {
	
	int[] arr;
	int N;
	
	public HeapSort(int[] myArr) {
		//arr = myArr; // this creates a pointer to myArr; alters client's original copy
		arr = new int[myArr.length];
		for(int i = 0 ; i < arr.length ; i++) 
			arr[i] = myArr[i];
		N = arr.length - 1;
	}
	
	public String sort() {
		String st = "Before Heap Sort: " + Arrays.toString(arr) + "\n";
		heapify();
		for(int i = N ; i > 0 ; i--) {
			swap(0, i);
			N = N - 1;
			maxheap(0);
		}
		st += "After Heap Sort:  " + Arrays.toString(arr) + "\n";
		return st;
	}

	private void heapify() {
		for(int i = N/2 ; i >= 0 ; i--)
			maxheap(i);
	}

	private void maxheap(int i) {
		int left = 2*i;
		int right = 2*i + 1;
		int max = i;
		
		if(left <= N && arr[left] > arr[i])
			max = left;
		if(right <= N && arr[right] > arr[max])
			max = right;
		
		if(max != i) {
			swap(i, max);
			maxheap(max);
		}
	}
	
	private void swap(int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;		
	}
}
