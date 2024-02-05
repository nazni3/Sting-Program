package com.jsp_pack1;

public class ReverseString {

	public static void main(String[] args) {
		String s1="nazni", rev="";
		
		for(int i=0;i<s1.length(); i++) {
			char ch=s1.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		

	}

}
