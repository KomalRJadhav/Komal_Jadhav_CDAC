import java.util.Scanner;

class BonusEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total classes held: ");
		int total = sc.nextInt();
		
		System.out.println("Enter classes attended: ");
		int attended = sc.nextInt();
		
		double totalAttendance = ((double)attended/total)* 100;
		
		if(totalAttendance >= 75){
			System.out.println("Student is allowed to sit for the exam.");
		}else{
			System.out.println("Student is not allowed to sit for the exam.");

		}
		
	}
}