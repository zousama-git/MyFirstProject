public class Main{
	public static void main(String [] args){
		
		/*
		//old way
		Integer a = new Integer(123);
		Double b = new Double(3.12);
		Character c = new Character('A');
		Boolean d =new Boolean(true);
		*/
		
		//autpboxing
		Integer a = 123;
		Double b = 3.12;
		Character c = 'A';
		Boolean d =true;
		
		//unboxing
		int A = a;
		double B = b;
		char C = c;
		boolean D= d;
		
		String e = Integer.toString(a);
		String f = Double.toString(b);
		String g = Character.toString(c);
		String h = Boolean.toString(d);
		
		//concat
		String m = e+f+g+h;
		
		//parse - from string
		
		int i = Integer.parseInt(e);
		double j = Double.parseDouble(f);
		char k = g.charAt(0);
		Boolean l = Boolean.parseBoolean(e);
		
		//others
		System.out.println(Character.isLetter('b'));
		System.out.println(Character.isUpperCase('b')); //isLowerCase
	}
}