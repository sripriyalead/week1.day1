package day1assignmennt;

public class TwoWheeler {

	int noOfWheels=4;
	short noOfMirrors=6;
	long chassusNumber=56784432L;
	boolean isPunctured=false;
	String bikeName="Apache";
	double runningKM=1000.76;
	
	
	public static void main(String[] args) {
		TwoWheeler obj=new TwoWheeler();
		System.out.println("Number of Wheels is " + obj.noOfWheels);
		System.out.println("Number of Mirrors is "+ obj.noOfMirrors);
		System.out.println("Number of Chassus is " + obj.chassusNumber);
		System.out.println("Pinctured status is " + obj.isPunctured);
		System.out.println("Bike Name is " + obj.bikeName);
		System.out.println("Kilometer Running is " + obj.runningKM);
		
		
	}

}
