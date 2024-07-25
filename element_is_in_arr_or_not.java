public class element_is_in_arr_or_not {
    public static void main(String[] args) {
        float arr[] = {50.2f, 503.5f, 84.4f, 984004.1f, 50540.5f};
        float b= 84.4f;
        boolean c = false;
        for(float element:arr){
            if(b == element){
                c = true;
                break;
            }
        }
            if(c){
             System.out.println("Ji haan");  
            }
            else{
             System.out.println("nop");
            }
    }
}
 