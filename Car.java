package day1assignmennt;

public class Car {

	public void applyBreak() {
		System.out.println("Break Applied");	
	}
	public void applyGear() {
		System.out.println("Gear Applied");
	}
	public void switchOnAC() {
		System.out.println("Ac switched on");
	}
	public void applyAccelerate() {
		System.out.println("Accelerate Applied");
	}

	public static void main(String[] args) {
		Car ca =new Car();
		ca.applyBreak();
		ca.applyGear();
		ca.switchOnAC();
		ca.applyAccelerate();


	}

}
