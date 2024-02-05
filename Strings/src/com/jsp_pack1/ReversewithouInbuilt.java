package com.jsp_pack1;

public class ReversewithouInbuilt {
	public static void main(String[]args) {
		String s="java is easy";
		char[]ch=s.toCharArray();
		String s2="";
		int count=0;
		
		for(char n:ch) {
			count++;
		}
		int i=count-1;
		int j=count-1;
		
		while(i>0) {
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int k=i+1;
			String temp="";
			while(k<=j) {
				temp=temp+ch[k];
				k++;
			}
			s2=s2+temp;
			if(i>=0) {
				s2=s2+" ";
			}
			i--;
			j=i;
		}
		System.out.println(s2);
		
	}

}
