//superclass
class Person{
	String first, last;
	
	Person(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	void showName(){
		System.out.println(first + " " + last);
	}
}

//subclass
class Student extends Person{
	double gpa;
	
	Student(String first, String last, double gpa){
		super(first, last);
		this.gpa = gpa;
	}
	
	void showGPA(){
		System.out.println(first + " " + last + "has a gpa of "+ gpa);
	}
}

class Employee extends Person{
	int salary;
	Employee(String first, String last, int salary){
		super(first, last);
		this.salary = salary;
	}
	
	void showSalary(){
		System.out.println(first + " " + last + "has a salary of R"+ salary);
	}
}

public class Main{
	public static void main(String [] args){
		Person person = new Person("Tom","Riddle");
		person.showName();
		
		Student student = new Student("Koko","Smich",4.5);
		//student.showName();
		student.showGPA();
		
		Employee employee = new Employee("Dave","Willy",12500);
		employee.showSalary();
	}
}