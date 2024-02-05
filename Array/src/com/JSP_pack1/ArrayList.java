package com.JSP_pack1;

public class ArrayList {

	 
		Object[] a= new Object[5];
		int count=0;
		
		public  int size() {
			return count;
		}
		private void increaseSize() {
		     Object [] temp=new Object[a.length+3];
		     for(int i=0;i<a.length;i++) {
		    	 temp[i]=a[i];
		     }
		     a=temp;
		}
		public void add(Object e) {
			if(count>=a.length) {
				increaseSize();
			}
			a[count]=e;
			count++;
		}
		public Object get(int index) {
			if(index<=-1 || index>size()) {
				throw new IndexOutOfBoundsException();
			}
			return a[index];
		}
		public void add(Object e,int index) {
			if(index<=-1 || index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			if(count>=a.length) {
				increaseSize();
			}
			for(int i=count-1;i>=index;i--) {
				a[i+1]=a[i];
				
			}
			a[index]=e;
			count++;
		}
		public void delete(int index) {
			if(index<=-1 || index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			
			for(int i=index+1;i<=size();i++) {
				a[i]=a[i+1];
			}
			count--;
			a[count]=null;
			
		}
        public void clear() {
        	a=new Object[5];
        	count=0;
        }
	

}
