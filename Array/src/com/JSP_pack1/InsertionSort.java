package com.JSP_pack1;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a= {12,11,13,5,6};
		System.out.println("Array1="+ Arrays.toString(a));
		Sort(a);
		System.out.println("Array2="+ Arrays.toString(a));
		

	}
	
	static void Sort(int []a) {
		
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
