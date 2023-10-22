import java.util.Random;

public class HW14Num {
    public static void main(String[] args) {
        Random random = new Random();
        String Num01 = "Число: ";
        int Num = random.nextInt(100000)+11;

        System.out.println(Num);
        int sum = 0;
        for (;Num>0;Num /=10 ) {
            int number02 = Num % 10;
            System.out.print(number02 + " ");
            sum += number02;
        }

        System.out.println("Сума розрядів: " + sum );




        }



    }

