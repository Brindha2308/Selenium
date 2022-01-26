package week1.day2;
/*
 * //Here is the input String test =
 * "$$ Welcome to 2nd Class of Automation $$ ";
 * 
 * // Here is what the count you need to find int letter = 0, space = 0, num =
 * 0, specialChar = 0;
 * 
 * // Build the logic to find the count of each Pseudo Code: a) Convert the
 * String to character array b) Traverse through each character (using loop) c)
 * Find if the given character is what type using (if) i) Character.isLetter ii)
 * Character.isDigit iii)Character.isSpaceChar iv) else -> consider as special
 * character
 * 
 * 
 * // Print the count here System.out.println("letter: " + letter);
 * System.out.println("space: " + space); System.out.println("number: " + num);
 * System.out.println("specialCharcter: " + specialChar);*/
public class FindTypes
  {
  public static void main(String[] args) {
	  String test = "$$ Welcome to 2nd Class of Automation $$ ";
	  int letter=0,space=0,number=0,spchar=0;
	  char[] arr = test.toCharArray();
	  for (int i = 0; i < arr.length; i++)
	  {
		  if(Character.isLetter(arr[i]))
				  {
			  		letter=letter+1;
				  }else if(Character.isDigit(arr[i]))
				  {
					number=number+1;
				  }else if(Character.isSpaceChar(arr[i]))
				  {
					  space=space+1;
				  }else
				  {
					  spchar=spchar+1;
				  }
		
	}
	  System.out.println("Letter: " +letter);
	  System.out.println("Number: " +number);
	  System.out.println("Space:" +space);
	  System.out.println("Special Character:" +spchar);
}
  
  }
 

