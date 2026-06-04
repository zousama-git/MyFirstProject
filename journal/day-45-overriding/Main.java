class Animal{
	void move(){
		System.out.println("This animal is running");
	}
}

class Cat extends Animal{
}

class Dog extends Animal{
}

class Fish extends Animal{
	@Override
	void move(){
		System.out.println("This fish is swimming");
	}
}

public class Main{
	public static void main(String [] args){
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Fish fish = new Fish();
		
		animal.move();
		dog.move();
		cat.move();
		fish.move();
	}
}