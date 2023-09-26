package KosulluIfadeler;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matemetik notunuz: ");
        mat = scanner.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = scanner.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = scanner.nextInt();

        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || turkce < 0 || turkce > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Yanlış Giriş Yaptınız.\nLütfen 0 ile 100 arasında sayı giriniz.");
        } else {
            double average = (mat + fizik + turkce + kimya + muzik) / 5;
            if (average < 55) {
                System.out.println("Sınıfta Kaldınız. Seneye tekrar görüşmek üzere");
            } else {
                System.out.println("Sınıfı Geçtiniz. Tebrikler!");

            }
            System.out.println("Ortalamanız: " + average);

            //Eğer girilen ders notları 0 veya 100 arasında değil ise
            // ortalamaya katılmasın.

        }
    }
}
