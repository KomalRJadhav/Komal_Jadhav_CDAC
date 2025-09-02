import java.util.Scanner;

class Divisibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0){
			System.out.println("Divisible by 2");
			if(number % 3 == 0){
				System.out.println("Divisible by 3");
				if(number % 5 == 0){
					System.out.println("Divisible by 5");
				}else{
					System.out.println("Not divisible by 5");
				}
			}else{
				System.out.println("Not divisible by 3");
			}
		}else{
			System.out.println("Not divisible by 2");
		}
	}
}