package sorting;

import java.util.Arrays;

import recursion.Permutations;
import collections.BinarySearchTree;

public class Test {
	public static void main(String args[]) throws NullPointerException{
		//int arr[] = {1,3,5,7,9,0,8,6,4,2};
		//int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		BubbleSort BS = new BubbleSort(arr);
		System.out.println(BS.sort());
		
		SelectionSort SS = new SelectionSort(arr);
		System.out.println(SS.sort());
		
		InsertionSort IS = new InsertionSort(arr);
		System.out.println(IS.sort());
		
		QuickSort QS = new QuickSort(arr);
		System.out.println(QS.sort());
		
		MergeSort MS = new MergeSort(arr);
		System.out.println(MS.sort());
		
		HeapSort HS = new HeapSort(arr);
		System.out.println(HS.sort());
		
		BinarySearchTree BST = new BinarySearchTree();
		System.out.println("Array before insertion into BST: " + Arrays.toString(arr));
		BST.createBST(arr);
		BST.display();
		System.out.println("Is 5 found? " + (int)BST.findNode(5).getValue());
		System.out.println("Is 10 found? " + BST.findNode(10));
		System.out.println("Height of Binary Search Tree is: " + BST.getHeight());
		System.out.println("Lowest common ancestor of 9 and 8 is: " + BST.findLowestCommonAncestor(9, 8).getValue());
		
		Permutations p = new Permutations("he");
		p.permute();
		
		return;
	}
}