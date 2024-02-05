package com.jsp_pack1;

public class InitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ram kumar jspider";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			char ch1=ch[i];
			
			if(ch1>='a' && ch1<='z') {
				if(i==0 || ch[i-1]==' ') {
					ch[i]=(char)(ch[i]-32);
				}
			}
				
		}
		System.out.println(ch);
		
	}

}
