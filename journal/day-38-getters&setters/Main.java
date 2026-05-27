public class Main{
	public static void main(String [] args){
		Car car = new Car("Charger","Yellow",100000);
		
		System.out.println(car.getColour()+" "+car.getModel()+" "+car.getPrice());
		
		car.setColour("Blue");
		car.setPrice(-120000);
		
		System.out.println(car.getColour()+" "+car.getModel()+" "+car.getPrice());
	}
}