package com.jsp_pack1;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		String s1="NazniParveen";
		
		for(int i=0; i<=s1.length()-1;i++) {
			char ch =s1.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch+=32;
			}
			else {
				ch-=32;
			}
			System.out.print(ch);
		}

	}

}
