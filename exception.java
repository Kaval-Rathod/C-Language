public class exception {
 public static void main(String[] args) {
 try {
 // Example 1: ArithmeticException
 int result = 5 / 0; // Attempting to divide by zero
 // Example 2: NullPointerException
 String str = null;
 int length = str.length(); // Attempting to access length of a null string
 // Example 3: ArrayIndexOutOfBoundsException
 int[] arr = new int[5];
 int value = arr[6]; // Attempting to access an index beyond the array size
 } catch (ArithmeticException e) {
 System.out.println("ArithmeticException caught: " + e.getMessage());
 } catch (NullPointerException e) {
 System.out.println("NullPointerException caught: " + e.getMessage());
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
 }
 }
}