import java.util.Scanner;

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Type Button from 1, 2 or 3");
        int Button = sc.nextInt();
        int num =  Button;
        switch (num) {
            case 1:
                System.out.println("Make order for Burger");
                break;
            case 2: 
                System.out.println("Make order for Shahi Paneer");
                break;
            case 3:
                System.out.println("Make order for Coffe");
                break;
            default:
                System.out.println("You are in dream dear wake up and do it manually in reality");
                break;
        }
    }
}
