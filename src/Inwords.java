import java.util.Scanner;

public class Inwords {
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
        String[] digits = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] doubles ={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] ties={" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

        if(number31==1){
                System.out.print("The number in the words is:"+ digits[number1]+"Thousand"+ digits[number21]+"Hundred"+ doubles[number4]);

                }
        else if(number21==0&&number31==0&&number4==0){
                System.out.print("The number in the words :" +digits[number1]+"Thousand");
        }
        else if(number21==0&&number4==0){
                System.out.print("The number in the words :" +digits[number1]+"Thousand"+ties[number31]);
        }
        else if(number4==0 && number31==0){
                System.out.print("The number in words:"+digits[number1]+"Thousand"+digits[number21]+"Hundred");
        }
                else if(number4==0)
                {
                System.out.print("The number in the words is:"+ digits[number1]+"Thousand"+digits[number21]+"Hundred"+ties[number31]);
                }

                else
                {
                        System.out.print("The number in words is:" + digits[number1] + "Thousand" + digits[number21] + "Hundred" + ties[number31] + digits[number4]);
                }
        }
}
