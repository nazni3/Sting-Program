package com.jsp_pack1;
import java.util.Scanner;

public class secondocc {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string");
	        String s = sc.nextLine();
	        String[] s1 = s.split(" ");
	        for (int i = 0; i < s1.length; i++) {
	            int count = 0;
	            for (int j = i + 1; j < s1.length; j++) {
	                if (s1[i].equals(s1[j])) {
	                    count++;
	                } else {
	                    break;
	                }
	            }
	            System.out.print(s1[i] + " ");
	            i += (count);
	        }
	    }
	}



import java.util.Scanner;

public class SecondMostOcurredLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int max = 0;
        int scMax = 0;
        String res = "";
        String sl = "";
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            char ch = c[i];
            if (ch == '\u0000' || ch == ' ')
                continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] == ch) {
                    count++;
                    c[j] = '\u0000';
                }
            }
            if (count > max) {
                scMax = max;
                max = count;
                sl = res;
                res = ch + "";
            } else if (count > scMax) {
                scMax = count;
                sl = ch + "";
            }

        }
        System.out.println("The second most occured letter is " + sl + " that ocured " + scMax + " times");
    }

}
