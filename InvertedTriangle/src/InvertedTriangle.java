import java.util.Scanner ;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n ;
        System.out.print("Enter the n (number of rows) : ");
        n = input.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * n - 1 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
