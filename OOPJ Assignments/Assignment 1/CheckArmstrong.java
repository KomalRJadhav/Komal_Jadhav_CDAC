import java.util.Scanner;

class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
		
		int temp = number;
		int sum = 0;

        while(temp != 0){
			int digit = temp %10;
			sum = sum + digit*digit*digit;
			temp = temp/10;
		}
		if(number == sum){
			System.out.println(number+ " is an Armstrong number");
		}else{
			System.out.println(number+ " is not an Armstrong number");
		}
    }
}