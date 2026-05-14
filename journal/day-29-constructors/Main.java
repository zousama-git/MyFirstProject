public class Main{
	public static void main(String[] args){
		Student st1 = new Student("Koko",21,4);
		Student st2 = new Student("Ben",19,3.9);
		Student st3 = new Student("Sandy",27,4.0);
		
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.gpa);
		System.out.println(st1.isEnrolled);
		st1.study();
		
		
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.gpa);
		System.out.println(st1.isEnrolled);
		st2.study();
		
		System.out.println(st3.name);
		System.out.println(st3.age);
		System.out.println(st3.gpa);
		System.out.println(st3.isEnrolled);
		st3.study();
	}
}