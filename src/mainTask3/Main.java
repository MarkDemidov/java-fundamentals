package mainTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        for (int i = 0; i < numbers; i++) {
            System.out.println((int) (0 + Math.random() * 100));
        }
        for (int i = 0; i < numbers; i++) {
            System.out.print((int) (0 + Math.random() * 100) + " ");
        }

    }
}

