import java.util.Scanner;

class CountPositiveNegativeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 6 numbers:");
		int[] numbers = new int[6];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}
		
		int positiveNum = 0;
		int negativeNum = 0;
		for(int i=0 ; i<numbers.length; i++){
			if(numbers[i] < 0){
				negativeNum++;
			}else{
				positiveNum++;
			}
		}
		System.out.println("Positive numbers: " + positiveNum);
		System.out.println("Negative numbers: " + negativeNum);
	}
}