import java.util.Scanner;

class EmployeeBonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter years of services: ");
		int years = sc.nextInt();
		
		
		if(years > 5){
			double bonus = salary*5/100;
			
			System.out.println("Bonus amount: "+ bonus);
		}
	}
}