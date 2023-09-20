package Giris;
import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

       //değişkenleri oluştur.
        int mat,fiz,kimya,turkce,tarih,muzik;

        //scanner sınıfımızı tanımladık.
        Scanner not = new Scanner(System.in);

        //kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz: ");
        mat = not.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = not.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = not.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce= not.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = not.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = not.nextInt();

       int toplam = (mat + fiz + kimya + turkce + tarih + muzik);
       double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız = "+ sonuc);
        String str = (sonuc>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);



    }
}
