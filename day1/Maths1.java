package week1.day1;
public class Maths1{
public int add(int a,int b) {
System.out.println(a+b);
	return a+b;
}
public int sub(int a,int b) {
	System.out.println(a-b);
	return a-b;
}
public int multiply(int a,int b) {
System.out.println(a*b);
	return a*b;
}
public int divide(int a,int b) {
System.out.println(a/b);
return a/b;
}
public static void main(String[] args) {
Maths1 m1 = new Maths1();
m1.add(10,10);
m1.sub(10,10);
m1.multiply(10,10);
m1.divide(10,10);
}
}