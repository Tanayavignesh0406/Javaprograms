package javaassignment;
class Book{
	private String Name;
	private String ISBN;
	private String Author;
	private String Publisher;

	public Book(String name,String isbn,String author,String publisher) {
		Name=name;
		ISBN=isbn;
		Author=author;
		Publisher=publisher;
	}
	public void setName(String Name) {
		this.Name=Name;
	}public String getName() {
		return Name;
	}public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}public String getISBN() {
		return ISBN;
	}public void setAuthor(String Author) {
		this.Author=Author;
	}public String getAuthor() {
		return Author;
	}public void setPublisher(String Publisher) {
		this.Publisher=Publisher;
	}public String getPublisher() {
		return Publisher;
	}
	
	public String getBookInfo() {
		String description = Name + " " + ISBN + " " + Author + " " + Publisher;
		return description;
	}
}

public class BookTest {
	public static void main(String[] args) {
		
		Book test[]=new Book[30];
		test[0]=new Book("science","1","wxyz","csscorp");
		test[1]=new Book("maths", "2", "abcd", "csscorp");
		test[2]=new Book("english", "3", "efgh", "csscorp");

		System.out.println(test[0].getBookInfo());
		System.out.println(test[1].getBookInfo());
		System.out.println(test[2].getBookInfo());

	}

}
