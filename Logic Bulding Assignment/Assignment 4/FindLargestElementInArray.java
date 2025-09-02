import java.util.Scanner;
import java.util.Arrays;

class FindLargestElementInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Integers: ");
		int[] elements = new int[5];
		
		for(int i=0; i<5; i++){
			elements[i] = sc.nextInt();
		}
		
		Arrays.sort(elements);
		System.out.println(elements[elements.length - 1]);
	}
}