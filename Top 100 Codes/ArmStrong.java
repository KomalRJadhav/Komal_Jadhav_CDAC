import java.util.Scanner;
import java.lang.Math;

class ArmStrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int original = num;
		int order = 0;
		while(original != 0){
			order++;
			original = original /10;
		}
		
		int sum =0;
		int temp = num;
		while(temp !=0){
			int digit = temp%10;
			sum = sum + (int)Math.pow(digit, order);
			temp = temp/10;
		}
		
		if(sum == num){
			System.out.println("It is armstrong number.");
		}else{
			System.out.println("It is not an armstrong number.");
		}
	}
}