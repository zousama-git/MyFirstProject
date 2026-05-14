public class Main{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Plant plant = new Plant();
		
		plant.photosynthesis();
		
		System.out.println(dog.isAlive);
		dog.eat();
		System.out.println(dog.lives);
		dog.speak();
		
		System.out.println(cat.isAlive);
		cat.eat();
		System.out.println(cat.lives);
		cat.speak();
		
		//dog.photosynthesis(); //does not work
		
	}
}