package com.jsp_pack1;

public class pana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdefghijklmnopqrstuvwxyz";
		System.out.println(checkPangram(s1));

	}
	
	 public static boolean checkPangram hfds (String s) {
	        // your code here
		 int[]freq = new int[26];
	        
	        for(char c:s.toCharArray()){
	            if(Character.isAlphabetic(c)){
	              if(c>='A' && c<='Z')freq[c-'A']++;
	              else freq[c-'a']++;  
	            }
	            
	        }
	        for(int ele:freq){
	            if(ele==0)return false; 
	        }
	        
	        return true;
	        
	    }

}
