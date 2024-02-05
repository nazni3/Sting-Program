package com.JSP_pack1;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a= {6,9,13,8,5};
		
		for(int i=0; i<a.length-1;i++) {
			System.out.print(a[i]);
			
		}
		Sort(a);
		for(int n:a) {
			System.out.println(n);
		}

	}
	static void Sort(int[]a) {
		for(int i=0; i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
