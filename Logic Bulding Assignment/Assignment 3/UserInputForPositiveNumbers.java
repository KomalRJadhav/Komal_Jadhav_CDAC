import java.util.Scanner;

class UserInputForPositiveNumbers{
	public static void main(String[] args){
		askForPositiveNumber();
	}
	public static void askForPositiveNumber(){
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter a positive number: ");
			num = sc.nextInt();
		}while(num <= 0);
		
		System.out.println("You entered a positive number: " + num);
	}
}