package com.jsp_pack1;

public class Encryption {

	public static void main(String[] args) {
		String s1="java";
		char [] characters=s1.toCharArray();
		int n=3;
		
		char [] alphabets="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0; i<characters.length;i++) {
			int index= characters[i]-'a';
			index =index+(n%26);
			characters[i]=alphabets[index%26];
		}
		String s2=new String(characters);
		System.out.println(s2);

	}

}
