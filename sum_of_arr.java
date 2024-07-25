public class sum_of_arr {
    public static void main(String[] args) {
        float arr[] = {50.2f, 503.5f, 84.4f, 984004.1f, 50540.5f};
        float b= 0;
        for(float element:arr){
            b = b + element;
        }
        System.out.println(b);
    }
}
