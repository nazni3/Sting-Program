package com.jsp_pack1;

public class SubstringPalindrome {
	
	static boolean isPalindrome(String s, int start, int end) {
		int i=start;
		int j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) 
				return false;
			i++;
			j--;
			
		}
		return true;
	}

	public static void main(String[] args) {
		String s1="malayalam";
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			
			
			for(int j=i+2;j<s1.length()-1;j++) {
				if(isPalindrome(s1,i,j)) {
					String s3=s1.substring(i,j+1);
					if(s3.length()>s2.length()) {
						s2=s3;
					}
				}
				
			}
			
		}
		System.out.println(s2);
	}


}
