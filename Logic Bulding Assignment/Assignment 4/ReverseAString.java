import java.util.Scanner;

class ReverseAString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String stringInput = sc.nextLine();
		
		String reverse = "";
		for(int i=stringInput.length()-1; i >=0; i--){
			reverse = reverse + stringInput.charAt(i);
		}
		System.out.println("Reversed string:" + reverse);
	}
}