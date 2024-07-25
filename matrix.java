public class matrix {
        public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] RES = new int[3][3];
        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
        RES[i][j] += A[i][k] * B[k][j];
        }
        }
        }
        // Print arrays A, B, and RES
        System.out.println("Array A:");
        printArray(A);
        System.out.println("\nArray B:");
        printArray(B);
        System.out.println("\nResultant Array (A * B):");
        printArray(RES);
        }
        // Helper method to print a 2D array
        public static void printArray(int[][] arr) {
            for (int[] row : arr) {
                for (int element : row) {
                System.out.print(element + " ");
                }
                System.out.println();
                }
                }
               }
               
