package oops_concept;

import java.util.Scanner;

public class SelectionSort {
	public void sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min= i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
				
			}
		}
	}
	
	
	void PrintArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	

	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		System.out.println("Array after selection sort");
		ss.PrintArray(arr);
	
	}

}
