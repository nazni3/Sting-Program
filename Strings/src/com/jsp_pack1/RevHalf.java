package com.jsp_pack1;

public class RevHalf {

	public static void main(String[] args) {
		String s1="knowledge";
		String s2= s1.substring(0,(s1.length())/2);
		
		s1= s1.replace(s2, "");
		System.out.println(s1+s2);
	

	}

}
