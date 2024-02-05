package com.jsp_pack1;

public class GetNum {
	public static void main(String[] args) {
		String s1="wow123";
		int sum=0;
		char[] s2= s1.toCharArray();
		
		for(char ch:s2) {
			if(ch>='0' &&ch<='9') {
				sum+=(ch-'0');
				
			}
			System.out.print(sum);
		}
		
	}

}
