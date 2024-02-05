package com.jsp_pack1;

public class HashStudent {
	private Student[] s= new Student[10];
	private int count;
	
	
	public boolean add(String e,int id) {
		int hc=Math.abs(e.hashCode());
		int index= hc%s.length;
		if(s[index]==null) {
			s[index]= new Student(e,id);
			count++;
			return true;
		}
		Student curr= s[index];
		while(curr!=null) {
			if(e.equals)
		}
	}

}
