package week1.day1;

public class Mobile {
	public void sendMsg()
	{
		System.out.println("Hello Every One");
		System.out.println("All the best!!");
	}
	private int makeCall()
	{
		int number=987654;
		return number;
	}
public void saveContact( String name,long contno)
{
	System.out.println(name);
	System.out.println(contno);
	}
public static void main(String[] args) {
	Mobile Mob=new Mobile();
	Mob.sendMsg();
	int num=Mob.makeCall();
	System.out.println("My number is:"+num);
	Mob.saveContact("Brindha",9876543210l);
	
}
}
