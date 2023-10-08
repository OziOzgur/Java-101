package Donguler;

import java.util.Scanner;

public class HarmonikSayilariBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n = scanner.nextInt();
        double result = 0.0;

        //int bir sayıyı int bir sayıya bölünce sayımız
        // int yani 1 tam sayı çıkacağı için i yi double alıyoruz.

        for (double i = 1; i <= n ; i++) {
            result += (1 / i);
        }
        // 1. döngü : i = 1; result = 0 + (1/1) =1;
        // 2. döngü : i = 2; result = 1 + (1/2) =1,5;

        System.out.println(result);
    }
}
