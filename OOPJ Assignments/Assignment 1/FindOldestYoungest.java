import java.util.Scanner;

class FindOldestYoungest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of Friend 1:");
		int friend1_age = sc.nextInt();
		
		System.out.println("Enter age of Friend 2:");
		int friend2_age = sc.nextInt();
		
		System.out.println("Enter age of Friend 3:");
		int friend3_age = sc.nextInt();
		
		if(friend1_age > friend2_age && friend1_age > friend3_age){
			System.out.println("Oldest: Friend1");
		}else if(friend2_age > friend3_age && friend2_age > friend1_age){
			System.out.println("Oldest: Friend2");
		}else{
			System.out.println("Oldest: Friend3");
		}
		
		if(friend1_age < friend2_age && friend1_age < friend3_age){
			System.out.println("Youngest: Friend1");
		}else if(friend2_age < friend3_age && friend2_age < friend1_age){
			System.out.println("Youngest: Friend2");
		}else{
			System.out.println("Youngest: Friend3");
		}
	}
	
}