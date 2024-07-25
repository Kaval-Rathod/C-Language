import java.util.Scanner;
public class Problame2 {
    public static void main(String[] args) {
        
        // p:1 fing avg of 3 sub
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Phy marks:");
        m1 = sc.nextByte();
        System.out.println("Enter your Chemystry marks:");
        m2 = sc.nextByte();
        System.out.println("Enter your Manth marks:");
        m3 = sc.nextByte();
        
        float avg = (m1+m2+m3)/3.0f;
        if(avg >=40 && m1>=35 && m2>=35 && m3>=35){
            System.out.println("Congratulations Tou got: "+avg+"%");
        }
        else{
            System.out.println("Better luck next time\nYou got just: "+avg+"%");
        }

        
    }
}
