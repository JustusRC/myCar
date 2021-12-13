package myCar;

public class Car {
	
			//Justus Contreras
			//P8.6
			//CS234
	
	
	
	
		//Variable Declaration
		double gas  ;
		double drive ;
		double distant;
		double mpg;
		
	
		//More Variable Declaration
		public Car(double efficiency)
		{
			mpg = efficiency;
			gas = 0;
			drive=0;
			
		}
		//Adds gas by the amount
		public void addGas(double amount) {
			
			gas=gas+amount;
		}
		//Drives the distance 
		public void drive (double distant)
		{
			//formula for drive
			drive = drive + distant;
			//formula to get the gas
			gas = gas - (distant / mpg);
		
		}
		
		public double getGasLevel()
		{
			return gas;
		}
	}


