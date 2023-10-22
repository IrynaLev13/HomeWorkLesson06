import java.util.Arrays;
import java.util.Random;

public class HWLot {
    public static void main(String[] args) {
        Random random = new Random();
        String Num01 = "Winning numbers";
        System.out.println(Num01);
        int[] t1array = new int[7];
        for (int index = 0; index < t1array.length; index++) {
            t1array[index] = random.nextInt(9);
        }
        //    System.out.println(Arrays.toString(t1array));
        Arrays.sort(t1array);
        System.out.println(Arrays.toString(t1array));

        String Num02 = "Guessed number";
        System.out.println(Num02);
        int[] t2array = new int[7];
        for (int index = 0; index < t2array.length; index++) {
            t2array[index] = random.nextInt(9);
        }
        //System.out.println(Arrays.toString(t2array));
        Arrays.sort(t2array);
        System.out.println(Arrays.toString(t2array));

        System.out.println("Сoincidences: ");

        for (int i = 0; i < t1array.length; i++) {
            int a = t1array[i];
            for (int j = 0; j < t2array.length; j++) {
                if (a == t2array[j] && i == j) {
                    System.out.print(a + ", ");
                    break;


                   }


            }


        }
    }
}