package Donguler;

import java.util.Scanner;

public class KombinasyonBulma {
    public static void main(String[] args) {

        int n, r;

         Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = scanner.nextInt();
        int fark = n - r;

        int totaln = 1;
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }

        int totalr = 1;
        for (int i = 1; i <= r ; i++) {
            totalr *= i;
        }

        int totalfark = 1;
        for (int i = 1; i <= fark ; i++) {
            totalfark *= i;
        }
        System.out.println("Kombinasyon (n,r) = " + (totaln / (totalr * totalfark)));
    }
}
