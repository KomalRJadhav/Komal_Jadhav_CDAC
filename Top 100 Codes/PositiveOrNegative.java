import java.util.Scanner;

class PositiveOrNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		String result = num < 0 ? "Negative":"Positive";
		System.out.println(result);
		
	}
}