class Customer{
	String name;
	String ticketType;
	static int ticketCount;
	
	Customer(String name){
		this.name = name;
		this.ticketType = "Normal";
		ticketCount++;
	}
	
	Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		ticketCount++;
	}
	
	void displayCustomer(){
		System.out.println("Name: "+name+",Ticket: "+ticketType);
	}
	
	static void ticketCount(){
		System.out.println("Total tickets sold: "+ticketCount);
	}
}
public class Main4{
	public static void main(String[] args){
		Customer customer1 = new Customer("Rahul");
		Customer customer2 = new Customer("Pooja", "Premium");
		Customer customer3 = new Customer("Amit");
		
		customer1.displayCustomer();
		customer2.displayCustomer();
		customer3.displayCustomer();
		
		Customer.ticketCount();
	}
}