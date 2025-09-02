import java.util.Scanner;

class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Divisible by 2");
        }
        if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        }
        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // If not divisible by any
        if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println("Not divisible by 2, 3, or 5");
        }
    }
}
