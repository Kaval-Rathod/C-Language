import java.util.*;

public class RKBank {
    static void Wellcome() {
        System.out.println("-------------------Welcome to RKBank---------------------");
        System.out.println("Enter your id:");
        Scanner userId = new Scanner(System.in);
        String input = userId.next();
        // System.out.println("User ID: " + input);
    }

    public static void main(String[] args) {
        Wellcome();
    }
}
