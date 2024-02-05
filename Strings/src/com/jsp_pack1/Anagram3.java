package com.jsp_pack1;

public class Anagram3 {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		
		if(s1.length()==s2.length()) {
			
			while(s1.length()>0) {
				char ch=s1.charAt(0);
			
				
				s1=s1.replace(ch+"", "");
				s2=s2.replace(ch+"","");}
			
			if(s1.length()==s2.length()) {
				System.out.println("Anagram");}
		}
								
			else {
				System.out.println("not anagram");}
				
			
		
	}

}
