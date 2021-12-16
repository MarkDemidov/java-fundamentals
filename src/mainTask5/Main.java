package mainTask5;
import java.util.Scanner;

public class Main {
    static String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        int n = scan.nextInt();
        while (n < 1 || n > month.length) {
            System.out.println("Enter correct month");
            n = scan.nextInt();
        }
        System.out.println(getMonth(n));
    }

    public static String getMonth(int n) {
        return month[n - 1];
    }
}

