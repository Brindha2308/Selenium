package week1.day1;

public class Student {
int rollno=123;
String name="Brindha";
public void collegeDetails()
{
System.out.println("Student Rollno:"+rollno);
System.out.println("Student name:"+name);
}
private int totalMark()
{
	int total=400;
	return total;
	}
void result(String s)
{
	System.out.println(s);
	}
	public static void main(String[] args) {
		char grad='A';
		Student S=new Student();
		S.collegeDetails();
		int mark1=S.totalMark();
		System.out.println("Total Marks:"+mark1);
		S.result("Pass");
		System.out.println("Grade:"+grad);
		
	}	
}	

