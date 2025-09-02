import java.util.Scanner;

class BasicCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double firstNum = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double secondNum = sc.nextDouble();
		
		System.out.println("Enter operator: ");
		char operator = sc.next().charAt(0);
		
		if(operator == '+'){
			System.out.println("Result: "+ (firstNum+secondNum));
		}else if(operator == '-'){
			System.out.println("Result: " + (firstNum-secondNum));
		}else if(operator == '*'){
			System.out.println("Result: "+ firstNum*secondNum);
		}else if(operator == '/'){
			if(secondNum == 0){
				System.out.println("Second number should not be 0");
			}else{
				System.out.println("Result: "+ firstNum/secondNum);
			}
			
		}else{
			System.out.println("Enter valid operator.");
		}
	}
}