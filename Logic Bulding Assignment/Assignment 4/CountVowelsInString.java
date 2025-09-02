import java.util.Scanner;

class CountVowelsInString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String stringInput = sc.nextLine();
	
		int count = 0;
		for(int i=0 ; i<stringInput.length(); i++){
			if(stringInput.charAt(i)=='a' || stringInput.charAt(i)=='e' || stringInput.charAt(i)=='i' || stringInput.charAt(i)=='o' || stringInput.charAt(i)=='u'){
				count = count + 1;
			}
		}
		System.out.println("The number of vowels in"+ stringInput + "is: " + count);
		}
	
}