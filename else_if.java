import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int a = sc.nextInt();
        sc.close();
        // int a=4;
        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("Hi");
        } else if (a % 2 == 0 || a % 2 != 0) {
            System.out.println("Good Bye");
        } else if (a % 2 == 0 || a % 7 == 0) {
            System.out.println("Bye");
        } else {
            System.out.println("Block");
        }
    }

}