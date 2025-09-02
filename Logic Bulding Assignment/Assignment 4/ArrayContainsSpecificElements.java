import java.util.Scanner;
import java.util.Arrays;

class ArrayContainsSpecificElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter 5 integers: ");
		Integer[] numbers = new Integer[5];
	
		for(int i=0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}
	
		System.out.println("Enter the number to serach: ");
		int num = sc.nextInt();
	
		if(Arrays.asList(numbers).contains(num)){
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
	}
	
}