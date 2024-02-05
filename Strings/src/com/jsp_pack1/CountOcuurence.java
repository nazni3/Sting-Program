package com.jsp_pack1;

public class CountOcuurence {

	public static void main(String[] args) {
		String s1="developer";
		System.out.println(s1.replace("e", ""));
		String s2=s1.replace("e", "");
		
		int count= s1.length()-s2.length();
		System.out.println(count);
		//System.out.println(s1.length());
		
		

	}

}
