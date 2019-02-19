import java.io.*;
import java.util.Scanner;

public class summing {

        static int getSum(int n)
        {
            int sum = 0;

            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }

            return sum;
        }


        public static void main(String[] args)
        {
            Scanner num= new Scanner(System.in);
            System.out.println("enter the number");
            int n = num.nextInt();


            System.out.println(getSum(n));
        }
    }
