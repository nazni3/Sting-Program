package com.jsp_pack1;

public class Length {

	public static void main(String[] args) {
		String a="nazni";
		int count=0;
		
		while(a.length()>0) {
			count++;
			char ch=a.charAt(0);
			a=a.replace(ch+"", "");
			System.out.println(a);
			
		}
		System.out.println(count);
		

	}

}
