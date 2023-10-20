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
        int [][] newmatrix = new int[n][m];
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
        System.out.println("New matrix");
         for (int i = 0; i < array012D.length; i++) {
            for (int j = 0; j < array012D[i].length; j++) {
                newmatrix  [j][i] = array012D [i][j];

            }
        }
        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix [i].length; j++) {
                System.out.printf(newmatrix[i][j] + ", ");
            }
            System.out.println();
        }


    }


}
