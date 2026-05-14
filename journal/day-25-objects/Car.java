public class Car {
	String make = "Ford";
	String model = "Mustang";
	int year = 2025;
	double price = 580000.99;
	static boolean isRunning = false;
	
		
	void start(){
		System.out.println("You start the engine");
		isRunning = true;
		System.out.println(isRunning);
	}
	
	void stop(){
		System.out.println("You stop the engine");
		isRunning = false;
		System.out.println(isRunning);
	}
	
	void drive(){
		System.out.println("You drive the "+model);
	}
	
	void brake(){
		System.out.println("You stop the "+model);
	}
}