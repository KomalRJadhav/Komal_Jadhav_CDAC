class Ticket{
	String passengerName;
	int ticketNo;
	static int counter = 5001;
	
	Ticket(String passengerName){
		this.ticketNo = counter++;
		this.passengerName = passengerName;
	}
	
	void displayTicket(){
		System.out.println("Ticket NO: "+ ticketNo + ", Passenger: "+passengerName);
	}
	
	public static void main(String[] args){
		Ticket t1 = new Ticket("Rahul");
		Ticket t2 = new Ticket("Priya");
		Ticket t3 = new Ticket("Amit");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
	}
}