class Vehicle1{
	String regNo;
	String ownerName;
	String vehicleType;
	static int vehicleCount;
	
	
	
	Vehicle1(String ownerName,String vehicleType){
		vehicleCount++;
		this.regNo = "MH-2025-" + vehicleCount;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	static{
		System.out.println("Welcome to CDAC Vehicle Registration Portal");
	}
	
	void setRegNo(String regNo){
		this.regNo = regNo;
	}
	
	String getRegNo(){
		return regNo;
	}
	
	void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	
	String getOwnerName(){
		return ownerName;
	}
	
	void setVehicleType(String vehicleType){
		this.vehicleType = vehicleType;
	}
	
	String getVehicleType(){
		return vehicleType;
	}
	
	void displayRegistrationDetails(){
		System.out.println("RegNo: "+ regNo+ ", Ownername: "+ ownerName+", vehicleType: "+vehicleType);
	}
	
	public static void main(String[] name){
		Vehicle1 v1 = new Vehicle1("Komal", "Car");
        Vehicle1 v2 = new Vehicle1("Neha", "Bike");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
	}
}