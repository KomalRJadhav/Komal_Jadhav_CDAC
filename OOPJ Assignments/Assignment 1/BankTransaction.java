import java.util.Scanner;

class BankTransaction{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter transaction amount: ");
		double amount = sc.nextInt();
		
		if(amount > 0){
			System.out.println("Deposit transaction.");
		}else{
			System.out.println("Withdrawal transaction.");
		}
	}
}