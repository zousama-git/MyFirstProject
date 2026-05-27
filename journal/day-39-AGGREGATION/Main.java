public class Main{
	public static void main(String [] args){
		Book book1 = new Book("The Fellow of the Ring",423);
		Book book2 = new Book("The Two Towers",352);
		Book book3 = new Book("the return of the King",416);
		
		Book[] books = {book1, book2, book3};
		
		for (Book book : books)	System.out.println(book.displayInfo());
		
		System.out.println("");
		Library library = new Library("ZOU Library", 2020, books);
		library.displayInfo();
	}
}