import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String [] args){
		
		ArrayList<Double> lists = new ArrayList<>();
		
		lists.add(3.1);
		lists.add(1.21);
		lists.add(2.11);
		
		System.out.println(lists);
		
		Collections.sort(lists);
		System.out.println(lists);
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("Banana");
		fruits.add("Coconut");
		
		System.out.println(fruits);
		
		fruits.remove(0);
		System.out.println(fruits);
		
		fruits.remove(1);
		System.out.println(fruits);
		
		fruits.set(0,"Pineapple");
		System.out.println(fruits);
		
		fruits.set(1,"Grapes");
		System.out.println(fruits);
		
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		
		System.out.println(fruits.size());
		
		for(Double list:lists) System.out.println(list);
	}
}