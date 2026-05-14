public class Main{
	public static void main(String[] args){
		
		Friend f1 = new Friend("Bob");
		Friend f2 = new Friend("Dave");
		Friend f3 = new Friend("Koko");
		Friend f4 = new Friend("Sandy");
		Friend f5 = new Friend("Teddy");
		
		System.out.println(Friend.numOfFriends);
		Friend.showFriends();
	}
}