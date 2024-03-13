public class FindLargest {
    public static int LargestValue(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static int SmallestValue(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if(smallest>numbers[i]) {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
      public static void main(String args[]) {
        int numbers[] = {1, 2,4,5,7,9,48};
        int largest = LargestValue(numbers);
        int smallest =  SmallestValue(numbers);
        System.out.println("Largest Number is "+ largest);
        System.out.println("Smallest Value is " + smallest);
      }
}
