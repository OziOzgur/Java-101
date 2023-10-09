package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int bolenTop = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenTop +=i;
            }
        }
        if (bolenTop == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
