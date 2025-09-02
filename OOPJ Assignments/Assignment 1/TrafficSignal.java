import java.util.Scanner;

class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (Red/Yellow/Green): ");
        String color = sc.next().toLowerCase(); 

        if(color.equals("red")) {
            System.out.println("Stop");
        } else if(color.equals("yellow")) {
            System.out.println("Wait");
        } else if(color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color! Please enter Red, Yellow, or Green.");
        }
    }
}
