package BasicJava;

import java.util.Scanner;

public class PrintAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a Character:");
		String n1=sc.nextLine();
		for(int i=0;i<n1.length();i++) {
		int c=(int)n1.charAt(i);
		System.out.print(c+" , ");
		}
	}

}
