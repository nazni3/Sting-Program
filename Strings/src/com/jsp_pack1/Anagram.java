package com.jsp_pack1;

import java.util.Arrays;

public class Anagram {

	
	static boolean isAnagram(char[] ar1, char[] ar2) {
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]!=ar2[i])
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		char[] ar1=s1.toCharArray();
		char[] ar2=s2.toCharArray();
		
		if(isAnagram(ar1,ar2)) {
			System.out.println("is Anagram");
		}
		else System.out.println("Not Anagram");
		

	}

}
