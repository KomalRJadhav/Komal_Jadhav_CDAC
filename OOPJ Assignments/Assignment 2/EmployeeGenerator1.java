class EmployeeGenerator1{
	int id ;
	String name = "Unknown";
	double basicSalary = 20000;
	static int counter = 1001;
	
	EmployeeGenerator1(){
		this.id = counter++;
	}
	
	EmployeeGenerator1(String name, double basicSalary){
		this.id = counter++;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	String getName(){
		return name;
	}
	
	double getSalary(){
		return basicSalary;
	}
	
	void calculateNetSalary(){
		double hra = 0.10 * basicSalary; // 10%
		double da  = 0.05 * basicSalary; // 5%
		double pf  = 0.02 * basicSalary; // 2%
		double netSalary = basicSalary + hra + da - pf;
		System.out.println("Net salary of " + name +" "+ netSalary);
	}

	
	void displayDetails(){
		System.out.println("ID: "+id+",Name: "+ name + ", basicSalary: "+ basicSalary);
	}
	
	public static void main(String[] args){
		EmployeeGenerator1 e1 = new EmployeeGenerator1();
		EmployeeGenerator1 e2 = new EmployeeGenerator1("komal", 60000);
		
		e1.displayDetails();
		e2.displayDetails();
		
		e2.calculateNetSalary();
		e1.calculateNetSalary();
	}
}