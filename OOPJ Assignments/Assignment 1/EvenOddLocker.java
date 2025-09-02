import java.util.Scanner;

class EvenOddLocker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter locker number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0){
			System.out.println("Even locker number.");
		}else{
			System.out.println("Odd locker number.");
		}
	}
}