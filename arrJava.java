// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {5,4,5,7,1,8,6,10,11};
        int n = Math.floorDiv(arr.length, 2);
        int l = arr.length;
        int temp;
        // System.out.println(n);
        for(int i = 0;i <= n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;     
        }
        for(int element: arr){
            
        System.out.println(element);
        }
    }
}