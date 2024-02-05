package com.JSP_pack1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {3,9,4,7,5,18};
		System.out.println("Array2="+Arrays.toString(a));
		Sort(a);
		System.out.println("Array2="+ Arrays.toString(a));

	}
	static void Sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			
			for(int j=i+1; j<a.length;j++) {
				if(a[j]<a[index])index=j;
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
