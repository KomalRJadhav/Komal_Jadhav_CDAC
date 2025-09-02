class Passenger{
	String name;
	int age;
	String seatType;
	static int totalPassengers;
	
	
	Passenger(String name, int age){
		this.name = name;
		this.age = age;
		this.seatType = "General";
		totalPassengers++;
	}
	
	Passenger(String name, int age, String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalPassengers++;
	}
	
	void displayPassengers(){
		System.out.println("Name: "+ name + ",Age: "+ age+ ",seatType: "+seatType);
	}
	
	static void countPassengers(){
		System.out.println("Total Passengers booked: "+ totalPassengers);
	}
	
}
public class Main3{
	public static void main(String[] args){
		Passenger passenger1 = new Passenger("Ravi", 25);
		Passenger passenger2 = new Passenger("Anita", 30, "AC Sleeper");
		Passenger passenger3 = new Passenger("Suresh", 40);
		
		System.out.print("Passenger1: ");passenger1.displayPassengers();
		System.out.print("Passenger2: ");passenger2.displayPassengers();
		System.out.print("Passenger3: ");passenger3.displayPassengers();
		
		Passenger.countPassengers();
		
	}
}