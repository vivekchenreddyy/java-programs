public class recusionn {
    public static void main(String[]  args){
        System.out.println(calculate(5));


    }
    public static int calculate(int number){

        if(number==1){
            return 1;
        }
            return calculate(number-1 )* number;


    }
}
