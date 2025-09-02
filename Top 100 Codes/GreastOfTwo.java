import java.util.Scanner;

class GreastOfTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num1 > num2 ? num1: num2; 
		System.out.println("Greatest number is: "+ result);
	}
}