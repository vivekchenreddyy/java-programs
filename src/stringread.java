
import java.util.Scanner;

public class stringread {
    public static void main(String[] args){

        Scanner string1=new Scanner(System.in);
        String a= string1.next();
//        String first = a.split("")[0];

        for(int i=0;i<5;i++) {
            String first = a.split("")[0];
            a = a.replace(first, "").trim();
//            System.out.println(a+first);
            a=a+first;
            System.out.println(a);
        }
    }
}
