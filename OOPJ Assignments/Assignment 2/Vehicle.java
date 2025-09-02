class Vehicle{
	String regNo;
	String ownerName;
	String vehicleType;
	static int vehicleCount;
	
	Vehicle(String ownerName,String vehicleType){
		vehicleCount++;
		this.regNo = "MH-2025-" + vehicleCount;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
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
		Vehicle v1 = new Vehicle("Komal", "Car");
        Vehicle v2 = new Vehicle("Neha", "Bike");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
	}
}