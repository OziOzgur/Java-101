package Donguler;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            for (int j = 1; j <= i - 1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2* (sayi - i) + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
