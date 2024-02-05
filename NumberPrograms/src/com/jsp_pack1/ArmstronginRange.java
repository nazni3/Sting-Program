package com.jsp_pack1;

public class ArmstronginRange {
	
	 static int count(int c){
	        int count=0;
	        while (c>0) {
	            count++;
	            c/=10;
	            
	        }
	        return count;
	       }

	       static boolean isArmstrong(int n){
	    	int sum=0;
	        int num=n;
	        int cnt=count(n);

	        while(n>0){
	        	
	            int d=n%10;
	            sum+=Math.pow(d, cnt);
	            n/=10;
	        }
	        if (sum==num) {
	            return true;
	        }
	        else {return false;}

	       }

	       public static void main(String[] args) {
	        
	        for(int i=1;i<=100;i++){
	            if (isArmstrong(i)) {
	             System.out.println(i);   
	            }
	        }
	        
	       }
	    

}
