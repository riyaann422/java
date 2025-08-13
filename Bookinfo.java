package java_project;
class Book{
	String title;
    String author;
	int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="central Library";
	public Book() {
		this.title ="Unknown title";
		this.author="Unknown author";
		this.bookID=bookCounter++;
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		this.bookID=bookCounter++;
	}
	public void displayInfo() { 
		System.out.println("Title:" + title + ", Author:"  + author +",ID:"+bookID);
	}
	public static void displayTotalBooks() {
		System.out.println("Total books:"+(bookCounter-1000));
	}
}
public class Bookinfo {
	public static void main(String[]args) {
		Book b1 = new Book();
		Book b2 = new Book("1980","Angel");
		Book b3 = new Book("Bird","Harper");
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo();
		Book.displayTotalBooks();
	}
}
	

	
				
	



