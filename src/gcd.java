import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        int n1, n2 , gcd=1;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the first number");
        n1=s.nextInt();
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the second number");
        n2=s1.nextInt();

        for(int i=1;i<=n1 && i<=n2;++i) {
            if(n1 %i==0 && n2%i ==0){
                gcd=i;
            }

        }
        System.out.printf("Gcd of %d and %d is %d" , n1 , n2 , gcd);
        }



    }

