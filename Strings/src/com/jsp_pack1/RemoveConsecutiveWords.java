package com.jsp_pack1;

public class RemoveConsecutiveWords {

	public static void main(String[] args) {
		String s1="Happy Happy Birthday";
		String [] s2=s1.split(" ");
		
		
		for(int i=0;i<s2.length;i++) {
			for(int j =i+1;j<s2.length;j++) {
				if(s2[i].equals(s2[j])) {
					String s3=s2[j].replace("j","");
					
					System.out.println(s3);
				}
			}
			
		}
	}

}
