abstract class Vehicle{
	abstract void go();
}

interface class Vehicle2{
	void go();
}

class Car extends Vehicle{
	void go(){
		System.out.println("You drive a car");
	}
}

class Bike extends Vehicle{
	void go(){
		System.out.println("You ride a bike");
	}
}

class Boat extends Vehicle{
	void go(){
		System.out.println("You sail a boat");
	}
}

public class Main{
	public static void main(String [] args){
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		
		Vehicle[] vehicles = {car, bike, boat};
		
		for (Vehicle vehicle : vehicles){
			vehicle.go();
		}
	}
}