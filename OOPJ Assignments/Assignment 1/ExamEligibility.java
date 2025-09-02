import java.util.Scanner;

class ExamEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Classes held: ");
		int total = sc.nextInt();
		
		System.out.println("Classes attended: ");
		int attended = sc.nextInt();
		
		System.out.println("Medical cause(Y/N): ");
		char cause = sc.next().charAt(0);
		
		double totalAttendance = ((double)attended/total)* 100;
		
		if(totalAttendance >= 75){
			System.out.println("Student is allowed to sit for the exam.");
		}else if (totalAttendance < 75 && (cause == 'Y' || cause == 'y')){
			System.out.println("Student is allowed to sit for the exam.");

		}else{
			System.out.println("Student is not allowed to sit for the exam.");
		}
		
	}
}