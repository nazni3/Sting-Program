package com.jsp_pack1;

public class MissingConsonants {

	public static void main(String[] args) {
		String s1="ramana";
		String s2="abcdefghijklmnopqrstuvwxyz";
		
		
			for(int j=0;j<s2.length();j++) {
				char c2=s2.charAt(j);
				if(s1.indexOf(c2)==-1) {
					System.out.print(c2+" ");
				}
			}
		}

	

}
