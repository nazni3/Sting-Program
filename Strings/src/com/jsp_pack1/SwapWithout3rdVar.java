package com.jsp_pack1;

public class SwapWithout3rdVar {

	public static void main(String[] args) {
		String s1="java";
		String s2="mava21";
		
		s1=s1+s2;
		//System.out.println(s1.length()-s2.length());
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1+" "+s2);
		
		

	}

}
