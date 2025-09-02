import java.util.Scanner;

class PrimeNumberWithRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num2; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
		
		
	}
	static boolean isPrime(int num){
			int count = 0;
			
			if(num < 2){
				return false;
			}
			
			for(int i=2; i<= num/2; i++){
				if(num%i == 0)
					return false;
			}
			
			return true;
	}
}