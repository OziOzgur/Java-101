package Donguler;

import java.util.Scanner;

public class Odev1_minMaxDeger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scan.nextInt();
        int max = 0, min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i +". sayıyı giriniz: ");
            int sayi = scan.nextInt();

            if (sayi > max){
                max = sayi;
            }
            if (sayi < min || min == 0){
                min = sayi;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
