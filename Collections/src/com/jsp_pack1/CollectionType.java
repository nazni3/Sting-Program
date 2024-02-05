package com.jsp_pack1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionType {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		
		c2.add(40);
		c2.add(50);
		c2.add(20);
		System.out.println(c2);
		
		boolean c3= c1.addAll(c2);
		System.out.println(c3);
		
		System.out.println(c2.isEmpty());
		System.out.println(c2.size());
		System.out.println(c2.contains(20));
		System.out.println(c2.containsAll(c1));
		System.out.println(c1.remove(30));
		System.out.println(c1);
		System.out.println(c1.retainAll(c2));
		System.out.println(c2.removeAll(c2));
		

	}

}
