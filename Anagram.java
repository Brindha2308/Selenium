package week1.day2;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	boolean check=false;
	int length = text1.length();
	int length2 = text2.length();
	if(length==length2)
	{
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray, charArray2))
				{
			check=true;
				}
	}
	if(check==true)
	{
		System.out.println("The String is Anagram");
	}
	else
	{
		System.out.println("The String is not Anagram");
	}
}
}
