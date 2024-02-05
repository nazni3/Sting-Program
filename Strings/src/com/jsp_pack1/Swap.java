package com.jsp_pack1;

public class Swap {
        static String Swap(String s,int start, int end) {
		
		char[] a=s.toCharArray();
		int i=0; int j=s.length()-1;
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}

	public static void main(String[] args) 
	{
		String s="abc";
		System.out.println(Swap(s,0,1));
		
//		char c=a[j];
//		
//		System.out.println(temp);
//		System.out.println(j);
	}

}
