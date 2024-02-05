package com.JSP_pack1;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int [] a= {9,4,6,10,1};
		quickSort(a);
		System.out.print(Arrays.toString(a));

	}
	
	public static void quickSort(int [] a) {
	   sort(a,0,a.length-1);
	}
	public static void sort(int [] a, int start, int end) {
		if(start>=end) return;
		int i=start, j=end;
		int pivot=a[(start+end)/2];
		
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			
		}
		sort(a,start,j);
		sort(a,i,end);
	}
	
	

}
