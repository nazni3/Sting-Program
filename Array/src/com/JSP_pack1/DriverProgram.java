package com.JSP_pack1;

public class DriverProgram {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a.get(3));
		System.out.println(a.size());
		a.add(60, 3);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("----------------");
		a.delete(3);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		a.clear();
		System.out.println(a.size());
		
	
	}

}
