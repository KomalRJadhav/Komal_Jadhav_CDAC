import java.util.Scanner;

class MenuDrivenJavaProgram{
	
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static boolean h;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int problemNo; 
		
		do{
			System.out.println("Enter your problem choice:\n"
								+ "Problem 1: Grade Evaluation System\n"
								+ "Problem 2: Leap Year Check\n"
								+ "Problem 3: Day of the week\n"
								+ "Problem 4: Identify Default Values of Variables\n"
								+ "Case 5: Exit");

			problemNo = sc.nextInt();
			
			switch(problemNo){
				case 1:
				int maths = 80;
				int science = 85;
				int history = 90;
			
				int average = (maths + science + history)/3;
				System.out.println("Average Marks: " + average);
			
				if(average >= 90){
					System.out.println("Grade A");
				}else if (average >= 70 && average <= 89) {
					System.out.println("Grade B");
				} else if (average >= 50 && average <= 69) {
					System.out.println("Grade C");
				} else if (average >= 30 && average <= 49) {
					System.out.println("Grade D");
				} else {
					System.out.println("Fail");
				}
				break;
				
				case 2:
				int year = 1900;
			
				if(year%4 == 0 && !(year % 100 ==0) || year % 400 == 0){
					System.out.println(year + " is a leap year");
				}else{
					System.out.println(year + " is not a leap year");
				}
				break;
				
				case 3:
				int day = 3;
			
				switch(day){
					case 1:
						System.out.println("Monday");
					break;
				
					case 2:
						System.out.println("Tuesday");
					break;
				
					case 3:
						System.out.println("Wednesday");
					break;
				
					case 4:
						System.out.println("Thursday");
					break;
				
					case 5:
						System.out.println("Friday");
					break;
				
					case 6:
						System.out.println("Saturday");
					break;
				
					case 7:
						System.out.println("Sunda3");
					break;
				
					default:
					System.out.println("Invalid day number");
				}	
				break;
				
				case 4:	
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				System.out.println(h);
				break;
				
				case 5:
				System.out.println("exit.");
				break;
			}
		}while(problemNo != 5);	
	}
}