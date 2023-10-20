import java.util.Random;
import java.util.Scanner;

public class HW13Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter value for M:");
       int m = scanner.nextInt();
        System.out.println("Enter value for N:");
       int n = scanner.nextInt();
        int[][] array012D = new int[m][n];
        for (int i = 0; i < array012D.length; i++) {
            for (int j = 0; j < array012D[i].length; j++) {

                array012D[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array012D.length; i++) {
            for (int j = 0; j < array012D[i].length; j++) {
                System.out.print(array012D[i][j] + ", ");
            }
            System.out.println();

        }
        int[][] array022D = new int[n][m];
        for (int i = 0; i < array022D.length; i++) {
            for (int j = 0; j < array022D[i].length; j++) {

                array022D[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array022D.length; i++) {
            for (int j = 0; j < array022D[i].length; j++) {
                System.out.print(array022D[i][j] + ", ");
            }
            System.out.println();
        }


    }


}
