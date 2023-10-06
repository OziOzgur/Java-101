package Donguler;

import java.util.Scanner;

public class Basamak_sayi_toplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        int kalan = 0;


        while (sayi != 0){

            kalan = sayi % 10;
            sayi = sayi / 10;

            toplam = toplam + kalan;
        }
        System.out.println("Sayı Değerleri Toplamı: " + toplam);

        }
    }