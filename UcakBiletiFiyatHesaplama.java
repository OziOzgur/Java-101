package KosulluIfadeler;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {

        int yas, yolculukTipi;
        double mesafe, tutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Mesafe Giriniz (km): ");
        mesafe = scanner.nextDouble();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = scanner.nextInt();

        System.out.print("Lütfen yolculuk tipinizi giriniz (1: Tek Yön, 2: Gidiş Dönüş): ");
        yolculukTipi = scanner.nextInt();

        tutar = mesafe * 0.10;


        // Kullanıcıdan alınan değerler geçerli
        // (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        if (((mesafe > 0) && (yas > 0) & (yolculukTipi == 1 || yolculukTipi == 2))) {

            // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

            if (yas < 12) {
                tutar -= tutar * 0.50;

                // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

            }
            if (yas >= 12 && yas <= 24) {
                tutar -= tutar * 0.10;

                // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

            }
            if (yas > 65) {
                tutar = tutar - (tutar * 0.30);

            }
            // Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
            if (yolculukTipi == 2) {
                tutar -= tutar * 0.20;
                tutar = tutar * 2;
            }
            System.out.println("Toplam Tutar: " + tutar);
        } else {

            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}