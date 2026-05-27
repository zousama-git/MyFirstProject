public class Main{
	public static void main(String[] args){
		User user4 = new User();
		System.out.println(user4.username);
		System.out.println(user4.email);
		System.out.println(user4.age);
		
		User user = new User("John");
		System.out.println(user.username);
		System.out.println(user.email);
		System.out.println(user.age);
		
		User user2 = new User("Ben", "test123@gmail.com");
		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user2.age);
		
		User user3 = new User("Ted", "wasTesting@yahoo.com",21);
		System.out.println(user3.username);
		System.out.println(user3.email);
		System.out.println(user3.age);
	}
}