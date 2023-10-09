package Donguler;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci seri sayısını yazınız: ");
        int sayi = scan.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 +" "+ n2);

        for (int i = 1; i < sayi; i++) {
            int next = n1 + n2;
            System.out.print(" " + next);
            n1 = n2;
            n2 = next;

            // n2 sayısını n1 sayısına devredip n2 ye de
            // nexti devrederek devam ediyor işlem.
        }

    }
}
