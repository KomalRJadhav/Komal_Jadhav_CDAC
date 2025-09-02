import java.util.Scanner;

class GreatestTestScores{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter score for Test 1:");
		int test1_score = sc.nextInt();
		
		System.out.println("Enter score for Test 2:");
		int test2_score = sc.nextInt();
		
		if(test1_score < test2_score){
			System.out.println("Test 2 has higher score.");
		}else{
			System.out.println("Test 1 has higher score");
		}
	}
	
}