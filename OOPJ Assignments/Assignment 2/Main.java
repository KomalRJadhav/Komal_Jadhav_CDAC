class Book{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks;
	
	Book(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if(issued == true){
			totalIssuedBooks++;
		}
	}
	

	void setTitle(String title){
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
	
	void setIssued(boolean issued){
		boolean original = this.issued;            //Store the status before updating it.
		this.issued = issued;
		if(original == false && issued == true){	// Compare before and after status
			totalIssuedBooks++;
		}else if(original == true && issued == false){
			totalIssuedBooks--;
		}
	}
	
	boolean getIssued(){
		return issued;
	}
	
	static void showTotalIssued(){
		System.out.println("Total books issued: "+totalIssuedBooks);
	
	}
	
}
public class Main{	
	public static void main(String[] args){
		Book book1 = new Book("Harry Potter","J.K. Rowling",true);
		Book book2 = new Book("Five Point Someone","Chetan Bhagat",false);
		Book book3 = new Book("Rich Dad Poor Dad","Robert Kiyosaki",true);
		
		System.out.println("Book1 issued?"+ book1.getIssued());
		System.out.println("Book2 issued?" + book2.getIssued());
		System.out.println("Book3 issued?" + book3.getIssued());
		
		//book1.setIssued(false);
		//book2.setIssued(true);
		
		Book.showTotalIssued();
		
	}
}