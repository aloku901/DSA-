import java.util.Scanner;

public class Day1Basics {
    public static void main(String[] args) {
        // Assignment 3 - Price of 3 Item
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int earaser = sc.nextInt();
        int total = pen+pencil+earaser;
        int TotalPricewithGST = total+((total/100)*18);
        System.out.println(TotalPricewithGST);

        // // Assignment 2 - Area of Square
        // Scanner sc = new Scanner(System.in);
        // int Side = sc.nextInt();
        // int Areaa = Side * Side;
        // System.out.println(Areaa);

        // // Assignment 1
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;

        // System.out.println("Average of a,b,c is "+avg);
        
        
        
        
        
        
        // // Type Casting - This is not allow in java we do it with data loss
        // float a = 25.12f;
        // // int b = a;
        // int b = (int)a;
        // System.out.println(b);
        // char ch = 'a';
        // char ch2 = 'b';
        // int Number = ch;
        // int Number2 = ch2;
        // System.out.println(Number);
        // System.out.println(Number2);

        // Type Conversion
        // int a = 25;
        // float b = a;
        // System.out.println(b);


        // // Area of Circle
        // Scanner sc = new Scanner(System.in);
        // float radius = sc.nextInt();
        // float Area = 3.14f*radius*radius;
        // System.out.println(Area);


        // // Sum of A & B By Input
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int Sum = a+b;
        // System.out.println(Sum);


        // // Input in Java
        // Scanner sc = new Scanner(System.in);
        // // String input = sc.next();
        // String Name = sc.nextLine();
        // // nextInt() for Integer
        // // nextFloat() for Floating Number
        // System.out.println(Name);




        //Comments in Java 
        // This is Single Line Comment!
        /*This is 
        Multi Line Comment*/

        // Sum of A & B
        // int a = 10;
        // int b = 20;

        // int sum = a+b;
        // System.out.println(sum);

        // Data type
        // byte a = 8;
        // System.out.println(a);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);
        // float price = 1.6;
        // System.out.println(price);
        // //long 
        // //Double
        // short n = 280;
        // System.out.println(n);


        // System.out.println("Hii Alok Good Restrart");
        // System.out.println("Alok Upadhyay");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // // Variable in Java
        // int a = 10;
        // int b = 20;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Alok Upadhyay";
        // System.out.println(name);
    }
}