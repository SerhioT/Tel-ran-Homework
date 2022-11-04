package Task_Java_4_11;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        Random t = new Random();
        t.setSeed(132);

        for (int i = 0; i < 15; i++) {
            int current = t.nextInt(0, 9);
            numbers[i] = current;
        }
        System.out.println(Arrays.toString(numbers));
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 & numbers[i] != 0)
            result++;
        }

        System.out.println(result);

    }
}