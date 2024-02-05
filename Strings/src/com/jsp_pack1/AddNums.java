package com.jsp_pack1;

public class AddNums {

	public static void main(String[] args) {
		String s1= "sdj1j22jh3h";
		char[] a=s1.toCharArray();
		int sum=0;
		int i=0;
		
		while(i<a.length) {
			if(a[i]>='0' && a[i]>='9') {
				String s2="";
				s2+=a[i];
				i++;
				System.out.println(s2);
				while(i<a.length && a[i]>='0' && a[i]>='9') {
					s2+=a[i];
					i++;
					System.out.println(s2);
				}
				sum+=Integer.parseInt(s2);
			}
			i++;
		}
		System.out.println(sum);
		
		
	}

}
