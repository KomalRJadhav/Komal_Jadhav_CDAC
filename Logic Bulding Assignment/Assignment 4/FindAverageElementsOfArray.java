import java.util.Scanner;

class FindAverageElementsOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 5 integers:");
		int[] numbers = new int[5];
		
		for(int i=0; i<5; i++){
			numbers[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<5; i++){
			sum = sum + numbers[i];
		}
		float average = sum / 5;
		
		System.out.println(average);
	}
}