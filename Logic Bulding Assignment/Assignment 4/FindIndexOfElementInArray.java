import java.util.Scanner;
import java.util.Arrays;

class FindIndexOfElementInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		int[] numbers = new int[5];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to search: ");
		int num = sc.nextInt();
		
		int index = Arrays.binarySearch(numbers, num);
		if(index >= 0){
			System.out.println("The number "+ num + " is found at index "+ index);
		}else{
			System.out.println("Not found");
		}
		
	}
}