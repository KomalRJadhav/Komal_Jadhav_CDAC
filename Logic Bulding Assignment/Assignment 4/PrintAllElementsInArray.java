import java.util.Scanner;

class PrintAllElementsInArray{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 5 elements: ");
		
		int[] arrayElements = new int[5];
		
		for(int i=0; i<5; i++){
			arrayElements[i] = sc.nextInt();
		}
		
		for(int elements : arrayElements){
			System.out.print(elements + " ");
		}
  }	
}