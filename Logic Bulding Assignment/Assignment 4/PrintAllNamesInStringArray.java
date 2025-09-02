import java.util.Scanner;

class PrintAllNamesInStringArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 4 names: ");
		String[] names = new String[4];
		
		for(int i=0; i<4; i++){
			names[i] = sc.nextLine();
		}
		
		for(String name : names){
			System.out.print(name);
		}
	}
}