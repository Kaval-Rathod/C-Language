public class squerroot{
    public static boolean ischeck(int num){
        int sqrt=(int) Math.sqrt(num);
        return sqrt*sqrt==num;
    }
    public static void main(String[] args) {
        int number = 2;
        if (ischeck(number)) {
        System.out.println(number + " is a perfect square.");
        } else {
        System.out.println(number + " is not a perfect square.");
        }
        }
}