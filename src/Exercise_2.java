import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        List<Double> list = new ArrayList<Double>();
        int index = 0;

        do {
            try {
                for (int i = 0; i < 50; i++) {
                    double n = rand.nextDouble();
                    list.add(n);
                }

                System.out.println("Enter an integer index value");
                index = input.nextInt();
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid index value");
                input.nextInt();
            }
        } while(true);

        System.out.println(list.get(index));
    }
}
