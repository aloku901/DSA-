import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int number[], int key) {
        for (int i=0; i<number.length; i++){
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number[] = {1,2,4,5,9,7,8,10,88};
    System.out.println("Please Enter Key Value");
    int key = sc.nextInt();

    int result = linearSearch(number, key);
    if(result == -1){
        System.out.println("Not Found");
    } else {
        System.out.println("Key is the present at index :" + result );
    }

   }
}
