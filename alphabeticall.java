import java.util.Scanner;

public class alphabeticall {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        int compare=a.compareTo(b);
        if(compare<0){
            System.out.println("First is greater than second");
        }else if(compare>0){
            System.out.println("Second is greater than first");
        }else{
            System.out.println("Both are equal");
        }
    }
}
