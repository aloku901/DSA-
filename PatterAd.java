public class PatterAd {
    public static void hollow_rectangle(int Rows, int cols) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == Rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(6,6);
    }
}
