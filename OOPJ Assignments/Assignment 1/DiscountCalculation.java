import java.util.Scanner;

class DiscountCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total purchase amount: ");
		double amount = sc.nextInt();
		
		if(amount > 1000){
			double discount = amount*0.1;
			
			double finalCost = amount - discount;
			
			System.out.println("Final cost after discount: "+ finalCost);
		}else{
			System.out.println("No discount, Final cost is: " + amount);
		}
	}
}