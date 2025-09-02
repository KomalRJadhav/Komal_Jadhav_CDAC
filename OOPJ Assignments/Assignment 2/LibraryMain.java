class Book{
	int bookId;
	String title;
	String author;
	
	Book(int bookId,String title,String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	void setBookId(int bookId){
		this.bookId = bookId;
	}
	
	int getbookId(){
		return bookId;
	}
	
	void settitle(String title){
		this.title = title;
	}
	
	String getTitle(){
		return title;
	}
	
	void setAuthor(String author){
		this.author = author;
	}
	
	String getAuthor(){
		return author;
	}
}

class Library{
	String libraryName;
	static int totalBooks;
	
	Library(String libraryName){
		this.libraryName = libraryName;
	}
	
	void addBooks(Book b){
		totalBooks++;
		System.out.println("Book added: "+b.getTitle());
	}
	
	static void displayTotalBooks(){
		System.out.println("Total books: "+ totalBooks);
	}
}

public class LibraryMain{
	public static void main(String[] args){
		Library lib = new Library("Books Library");
		
		Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Effective Java", "Joshua Bloch");
		
		lib.addBooks(b1);
		lib.addBooks(b2);
		
		Library.displayTotalBooks();
	}
}