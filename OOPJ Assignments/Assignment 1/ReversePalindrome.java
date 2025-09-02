import java.util.Scanner;

class ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int number = sc.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + reverse);

        if (number == reverse) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}
