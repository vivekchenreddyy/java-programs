import java.util.Scanner;

public class Calculaterooo {
    public static void main(){
        double num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number");

        num1=scanner.nextDouble();
        System.out.println("Enter the next number");
        num2=scanner.nextDouble();
        System.out.println("Enter the operator ");
        char operator=scanner.next().charAt(0);
        scanner.close();
        double output;
        switch(operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("you have enter something fishy");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+"is"+output);

    }




}
