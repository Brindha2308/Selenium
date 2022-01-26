package week1.day2;

// declare and initialize a variable count to store the number of occurrences

// convert the string into char array
	
//get the length of the array
	
// traverse from 0 till the array length 
	
	// Check the char array has the particular char in it 

	// if is has increment the count
		 
	
	// print the count out of the loop
		
public class Charoccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		int length = str.length();
		System.out.println("length is:"  +length);
		for (int i1 = 0; i1 < charArray.length; i1++) 
		{
			char char1=str.charAt(i1);
			if(char1=='e')
{
				System.out.println(+i1);
}
		}
		
		
	}

}
