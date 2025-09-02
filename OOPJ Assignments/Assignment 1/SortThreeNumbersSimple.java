import java.util.Scanner;

class SortThreeNumbersSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest, middle, largest;

        if(a <= b && a <= c) {
            smallest = a;
            if(b <= c) {
                middle = b; largest = c;
            } else {
                middle = c; largest = b;
            }
        }
        else if(b <= a && b <= c) {
            smallest = b;
            if(a <= c) {
                middle = a; largest = c;
            } else {
                middle = c; largest = a;
            }
        }
        else {
            smallest = c;
            if(a <= b) {
                middle = a; largest = b;
            } else {
                middle = b; largest = a;
            }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
    }
}
