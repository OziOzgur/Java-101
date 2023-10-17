package Metotlar;

import java.util.Scanner;

public class UsHesaplayanProg {
    static int power() {

        Scanner scan = new Scanner(System.in);
        int base, exponent, result;

        System.out.print("Taban değeri giriniz: ");
        base = scan.nextInt();

            System.out.print("Üs değeri giriniz: ");
            exponent = scan.nextInt();
            result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println("Sonuç: " + power());

    }
}
