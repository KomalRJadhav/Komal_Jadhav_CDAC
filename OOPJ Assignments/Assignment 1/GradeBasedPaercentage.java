import java.util.Scanner;

class GradeBasedPaercentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter percentage marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 90){
			System.out.println("Grade: A+");
		}else if(marks >= 76 && marks <= 89){
			System.out.println("Grade: A");
		}else if(marks >= 66 && marks <= 75){
			System.out.println("Grade: B+");
		}else if(marks >= 51 && marks <= 65){
			System.out.println("Grade: B");
		}else if(marks >= 36 && marks <= 50){
			System.out.println("Grade: C");
		}else{
			System.out.println("Fail");
		}
	}
}