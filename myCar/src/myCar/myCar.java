public class myCar {

	public static void main(String[] args) {

		Car myCar = new Car(20);
		
		myCar.addGas(20);
		myCar.drive(100);

		System.out.println("Fuel remaining: " + myCar.getGasLevel());
		
		
	}

}
