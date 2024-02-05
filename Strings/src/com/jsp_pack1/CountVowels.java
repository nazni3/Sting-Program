package com.jsp_pack1;

public class CountVowels {

	public static void main(String[] args) {
	
		String s1="NazniParveen";
		
		String s2=s1.toLowerCase();
		
		for(int i=0;i<=s2.length()-1;i++) {
			char ch= s2.charAt(i);
			int count=0;
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u') {
				count++;
				System.out.println(ch+"="+count);
			}
			
		}
		//System.out.println(count);

	}

}
