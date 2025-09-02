import java.util.Scanner;

class FindSumOfElementsInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter 5 integers: ");
	
		int[] arrayElements = new int[5];
		for(int i=0 ; i<5; i++){
			arrayElements[i] = sc.nextInt();
		}
	
		int sum = 0;
		for(int elements : arrayElements){
			sum = sum + elements;
		}
		System.out.print(sum);
	}
}