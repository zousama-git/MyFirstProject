class Car{
	String make, model, colour;
	int year;
	
	Car(String make, String model, int year, String colour){
		this.make =make;
		this.model = model;
		this.year = year;
		this.colour = colour;
	}
	
	@Override
	public void toString(){
		System.out.println(this.colour +" "+this.year+" "+this.make+" "+this.model);
	}
}

public class Main{
	public static void main(String [] args){
		Car car1 = new Car("Ford", "Musteng",2025, "Red");
		Car car2 = new Car("Chevrolet", "Corvette",2026, "Blue");
		System.out.println(car1); //Car@61d47554
		System.out.println(car2);
	}
}