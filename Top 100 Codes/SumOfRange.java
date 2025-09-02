import java.util.Scanner;

class SumOfRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum =0;
		
		for(int i =num1; i<=num2;i++){
			sum = sum + i;
		}
		System.out.println("Sum is: "+sum);
	}
}