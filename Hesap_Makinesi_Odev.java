package KosulluIfadeler;

import java.util.Scanner;

public class Hesap_Makinesi_Odev {
    public static void main(String[] args) {

        int n1, n2, secim;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı seçiniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme");
        System.out.print("Seçiminiz: ");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma = " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
                        System.out.println("Bölme = " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");

        }

    }
}
