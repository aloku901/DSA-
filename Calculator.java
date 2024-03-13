import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Please Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Please Enter Operator");
        char opr = sc.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Dear my Calculator is Limited Power");
                break;
        }
    }
}
