package com.jsp_pack1;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Boss";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					s=s.replace(ch[j]+"", "$");
					
					System.out.println(s);
				}
				
			}
		}

	}

}
