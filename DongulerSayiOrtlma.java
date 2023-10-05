package Donguler;

import java.util.Scanner;

public class DongulerSayiOrtlma {
    public static void main(String[] args) {

        int toplam = 0;
        int adet = 0;
        double ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz: ");
        int sayi = scanner.nextInt();


        for (int i = 1; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println("3 ve 4'e bölünebilen sayılar: " + i);
                toplam += i;
                adet ++;
        }
    }
     ortalama = toplam / adet;
        System.out.println("Ortalama: " + ortalama);
}
}