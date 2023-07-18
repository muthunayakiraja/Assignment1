package week1.day1;
public class Mobile {
	public void makecall()	{
		System.out.println("This is make a call");
		String mobilemodel = " vivo";
		float  mobileweight = 4.3f;
		System.out.println("mobilemodel "+mobilemodel);
		System.out.println( "mobileweight "+ mobileweight);
	}
public void sendMsg() {
	System.out.println("This is send message");
	boolean isfullcharged = false;
	int mobilecost = 34;
	System.out.println("isfullcharged "+isfullcharged);
	System.out.println("mobilecost " +mobilecost);
	}
public static void main (String[] args) {
	Mobile m1 = new Mobile();
	m1.makecall( );
	m1.sendMsg( );
	System.out.println("this is my mobile");

}
}
