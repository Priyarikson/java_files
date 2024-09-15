package javaPackage;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("go slow implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

}
