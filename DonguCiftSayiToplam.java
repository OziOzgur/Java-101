package Donguler;

import java.util.Scanner;

public class DonguCiftSayiToplam {
    public static void main(String[] args) {

        int sayi;
        int total=0;
        Scanner scan = new Scanner(System.in);
         do {
             System.out.print("Sayı Giriniz: ");
             sayi = scan.nextInt();
             if (sayi % 4 == 0){
                 total +=sayi;
             }
         }while (sayi % 2 != 1);
        System.out.println("Toplam: " + total);
    }
}
