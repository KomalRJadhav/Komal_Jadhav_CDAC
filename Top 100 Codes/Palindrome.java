import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int reverse = 0;
		
		while(temp != 0){
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		
		if(num == reverse){
			System.out.println("It is palindrome.");
		}else{
			System.out.println("It is not palindrome.");
		}
	}
}