package com.jsp_pack1;

public class HashSet {
      private int count=0;
      private Node[]a=new Node[10];
      
      public boolean add(Object k) {
    	  int hc=Math.abs(k.hashCode());
    	  int index= hc%a.length;
    	  if(a[index]==null) {
    		  a[index]= new Node(k,null);
    		  count++;
    		  return true;
    	  }
    	  Node prev=null;
    	  Node curr=a[index];
    	  while (curr!=null) {
    		  if(k.equals(curr.key)) return false;
    		  prev=curr;
    		  curr=curr.next;
    	  }
    		  prev.next=new Node(k,null);
    		  count++;
    		  return true;
    	  }
//    	  public void iterate() {
//    		  for(int i=0;i<a.length;i++) {
//    			  Node curr=a[i];
//    			  while(curr!=null) {
//    				  System.out.print(curr.key+" ");
//    			  }
//    		  }
//    		  System.out.println();
//    	  }
		public void iterate() {
			 for(int i=0;i<a.length;i++) {
   			  Node curr=a[i];
   			  while(curr!=null) {
   				  System.out.print(curr.key+" ");
   			  }
   		  }
   		  System.out.println();
			
		}
      }

