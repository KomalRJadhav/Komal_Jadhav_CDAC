import java.util.Scanner;

class PrintMultipleOf3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		for(int i =1; i<n; i++){
			if(i*3 < n){
				System.out.print(i*3 + " ");
			}
		}
	}
}