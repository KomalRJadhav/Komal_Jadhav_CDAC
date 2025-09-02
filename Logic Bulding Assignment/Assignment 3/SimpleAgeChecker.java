import java.util.Scanner;

class SimpleAgeChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		checkAgeCategory(age);
	}
	
	public static void checkAgeCategory(int age){
		if(age < 18){
			System.out.println("You are minor.");
		}else if(age < 50){
			System.out.println("You are Adult.");
		}else{
			System.out.println("You are senoir citizen.");
		}
	}
}