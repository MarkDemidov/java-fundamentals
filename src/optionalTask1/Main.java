package optionalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество целых чисел: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        System.out.print("Введите целые числа через пробел:");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < N; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Минимльное число:" + min);

        int max = array[0];
        for (int i = 0; i < N; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимальное число:" + max);

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}




