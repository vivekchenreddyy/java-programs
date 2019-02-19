import java.util.Scanner;

public class alphabeticall {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        int compare=a.compareTo(b);
        if(compare<0){
            System.out.println("First one is greater than second");
        }else if(compare>0){
            System.out.println(b);
        }else{
            System.out.println("Second one is greater than first");
        }
    }
}
