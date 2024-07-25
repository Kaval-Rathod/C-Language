public class find_max_value {
    public static void main(String[] args) {
        int arr[] = {1,5,7872,85,5,2,5,87};
        int max = 0;
        for(int e:arr){
            if(max < e){
                max = e;
            }
        }
         System.out.println(max);    
     }
}
