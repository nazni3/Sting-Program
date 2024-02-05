package com.jsp_pack1;

public class MaxOccurence {

	public static void main(String[] args) {
		String s="nazni";
		char ch1='\u0000';
		char[] ch2=s.toCharArray();
		int max=0;
		
		
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			
			for(int j=i+1;j<s.length();j++) {
				if(ch2[i]==ch2[j]) {
					count++;
					ch2[j]='\u0000';
				}
			}
			
			if(ch2[i]!='\u0000' && count>max) {
				ch1=ch2[i];
				max=count;
			}
			}
			System.out.println(ch1+"="+max);
		}
		

	}


