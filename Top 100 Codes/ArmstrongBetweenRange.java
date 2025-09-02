import java.util.Scanner;
import java.lang.Math;

class ArmstrongBetweenRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		
		for(int i= num1; i<=num2; i++){
			int temp = i;
			int order = 0;
			while(temp != 0){
				order++;
				temp = temp /10;
			}
		
			int temp1 = i;
			int sum = 0;
			while(temp1 != 0){
				int digit = temp1%10;
				sum = sum + (int)Math.pow(digit, order);
				temp1 = temp1/10;
			}
			if(i == sum){
				System.out.println(i);
			}
		}
	}
}