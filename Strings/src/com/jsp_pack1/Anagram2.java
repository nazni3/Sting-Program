package com.jsp_pack1;

public class Anagram2 {

	public static void main(String[] args) {
		        String str1 = "silent";
		        String str2 = "listen";

		        // Check if the strings are of equal length
		        if (str1.length() != str2.length()) {
		            System.out.println("The strings are not anagrams");
		            return;
		        }

		        // Create two character arrays to store the characters of the strings
		        char[] arr1 = str1.toCharArray();
		        char[] arr2 = str2.toCharArray();

		        // Create a boolean array to track whether each character has been found
		        boolean[] found = new boolean[256];

		        // Iterate over the first string
		        for (char c : arr1) {
		            // If the character has not been found in the second string, print "Not Anagram" and return
		            if (!found[c]) {
		                System.out.println("Not Anagram");
		                return;
		            }
		        }

		        // If all the characters have been found, print "Anagram"
		        System.out.println("Anagram");
		    
		

	}

}
