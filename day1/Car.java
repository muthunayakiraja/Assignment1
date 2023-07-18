package week1.day1;

public class Car {
public void applyBreak() {
		System.out.println("Applied break");	
		}
public void soundhorn() {
	System.out.println("Sound horn");
	}
public static void main(String[] args) {
	Car c1 = new Car();
	c1.applyBreak();
	c1.soundhorn();
}
}
