import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 10000");
        Scanner scanner =new Scanner(System.in);
        int number=0;
        while(number==-1);
        number = scanner.nextInt();
        int number1=number/1000 ;
//        System.out.println(number1);
        int number2=number/100 ;
        int number21=number2%10;
//        System.out.println(number21);
        int number3=number%100 ;
        int number31=number3/10;
//        System.out.println(number31);
        int number4=number%10 ;
//        System.out.println(number4);
        String[] digits = new String[]{ "zero", "one",
                "two", "three", "four",
                "five", "six", "seven",
                "eight", "nine"};

        System.out.print("The number in words is:"+digits[number1]+digits[number21]+digits[number31]+digits[number4]);
//        System.out.print("The number in words is:"+digits[number2]);

    }

}
