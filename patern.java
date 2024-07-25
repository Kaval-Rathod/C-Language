import java.util.Scanner;
public class patern {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number");
        int star = num.nextInt();
        for(int i = star; i>0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
                System.out.print("\n");
        }
    }
}
