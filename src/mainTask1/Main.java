package mainTask1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
    }
}
