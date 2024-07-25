public class Arr_Reverse {
    public static void main(String[] args) {
        int arr[]={1,5,2,5,2,5,7};
        int temp;
        int len = arr.length;
        int sent = Math.floorDiv(len,2);
        for(int i = arr.length - 1; i >= 0  ; i--){
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        for(int element:arr)
        System.out.println(element);    
    }
}

