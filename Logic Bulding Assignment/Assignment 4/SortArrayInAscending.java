import java.util.Scanner;
import java.util.Arrays;

class SortArrayInAscending{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		int[] numbers = new int[5];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		
	}
}