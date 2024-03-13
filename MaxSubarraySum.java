public class MaxSubarraySum {
    public static void Sumsubarr(int numbers[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start =i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                curSum = 0;
                for(int k=start; k<=end; k++) {
                    curSum +=numbers[k];
                }
                System.out.println(curSum);
                if(maxSum< curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length;  i++) {
            cs = cs +numbers[i];
            if(cs < 0) {
                cs =0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max SubArray Sum is: "+ ms);
    } 
    public static void main(String[] args) {
         int numbers[] = {1,6,4,8,-1};
        // Sumsubarr(numbers);
        kadanes(numbers);
    }   
}