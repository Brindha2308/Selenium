package week1.day2;

public class Primenumber {
public static void main(String[] args) {
	int no=13,j;
	boolean flag=false;

	for (j = 2; j <=no/j; j++) {
				
		if((no%j==0))
			//if((no%2==0)||(no%3==0)||(no%5==0)
		{
		 flag=true;
		 break;
		}
	}
	if(flag==true)
	{
	System.out.println("The number is not a Prime Number: "+no);
	}
	else{
		System.out.println("The number is a Prime number: "+no);		
	}
}
}
