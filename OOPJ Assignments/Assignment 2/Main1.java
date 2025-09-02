class Employee{
	String name;
	double salary;
	int yearsOfService;
	
	static int totalEmployees;
	
	Employee(String name, double salary, int yearsOfService){
		this.name = name;
		this.salary = salary;
		this.yearsOfService = yearsOfService;
		
		totalEmployees++;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setSalary(double salary){
		this.salary = salary;
	}
	
	double getSalary(){
		return salary;
	}
	
	void setYearsOfService(int yearsOfService){
		this.yearsOfService = yearsOfService;
	}
	
	double calculateBonus(){
		if(yearsOfService > 5){
			return salary*0.05;
		}else{
			return 0;
		}
	}
	
	static void showTotalEmployees(){
		System.out.println("Total employees: "+ totalEmployees);
	}
}

public class Main1{
	public static void main(String[] args){
		Employee employee1 = new Employee("Ravi",150000,6);
		Employee employee2 = new Employee("Anita",120000,3);
		Employee employee3 = new Employee("Suresh",100000,5);
		
		System.out.println("Employee Ravi bonus: "+employee1.calculateBonus());
		System.out.println("Employee Anita bonus: "+employee2.calculateBonus());
		System.out.println("Employee Suresh bonus: "+employee3.calculateBonus());
		
		Employee.showTotalEmployees();

	}
}