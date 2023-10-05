package Donguler;

import java.util.Scanner;

public class UsluHesaplamaFor {
    public static void main(String[] args) {

        int taban,us, total = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban sayısı: ");
        taban = scanner.nextInt();
        System.out.print("Üs sayısı: ");
        us = scanner.nextInt();

        for (int i = 1; i <= us ; i++) {
            total *= taban;
        }
        System.out.println("Sonuç: " + total);
    }
}
