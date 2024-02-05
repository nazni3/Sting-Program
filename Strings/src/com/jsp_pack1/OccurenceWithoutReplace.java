package com.jsp_pack1;

public class OccurenceWithoutReplace {

	public static void main(String[] args) {
		String s1="malyalam";
		char[] ch=s1.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';
				}}
				if(ch[i]!=' ')
					System.out.println(ch[i]+"="+count);
				System.out.println(ch);
			}
			
			
			
		}
		
		

	}


