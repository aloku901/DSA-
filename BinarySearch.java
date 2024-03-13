import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start =0, end = numbers.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,3,4,5,6,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter which is you want Search");
        int key = sc.nextInt();
        int result = binarySearch(numbers, key);
        if(result == -1) {
            System.out.println("Number Not Found");
        } else {
            System.out.println("Index for key is :" + result);
        }
    }
}
