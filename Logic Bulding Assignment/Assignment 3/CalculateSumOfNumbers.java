import java.util.Scanner;

class CalculateSumOfNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		calculateSum(number);
		
	}
	
	static void calculateSum(int number){
		int sum = 0;
		for(int i = 1; i <= number; i++){
			sum = sum + i;
		}
		
		System.out.println("The sum of numbers from 1 to "+ number + " is: " + sum);
	}
}