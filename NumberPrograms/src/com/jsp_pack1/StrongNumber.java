package com.jsp_pack1;

public class StrongNumber {
	public static boolean isStrong(int n) {
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int prod=1;
			int rem=n%10;
			
			for(int i=1;i<=rem;i++) {
				prod*=i;
			}
			sum+=prod;
			n/=10;
		}
		if(sum==temp) {
			return true;
		}
		else {return false;}
	}

	public static void main(String[] args) {
		int n1=1;
		int n2=1000;
		for(int i=n1;i<=n2;i++) {
			if(isStrong(i))
			System.out.println(i);
		}
		

	}

}
