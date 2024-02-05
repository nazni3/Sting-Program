package com.jsp_pack1;

public class MissingVowels {

	public static void main(String[] args) {
		String s1="ramana";
		String s2="aeiou";
		
		
			for(int j=0;j<s2.length();j++) {
				char c2=s2.charAt(j);
				if(s1.indexOf(c2)==-1) {
					System.out.print(c2+" ");
				}
			}
		}

	

}
