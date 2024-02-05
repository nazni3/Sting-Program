package com.jsp_pack1;

public class Panagram {

	public static void main(String[] args) {
		String s1="abcdefghijklmnopqrstuvwxyz";
	     s1=s1.toLowerCase();
	
		int count=0;
		
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			
			if(ch>='a' && ch<='z') {
				
				s1=s1.replace(ch+"", "");
				count++;
			}
			
		}
		if(count==26) {
			System.out.println("panagram");
		}
		else
			System.out.println(" not a panagram");

	}

}
