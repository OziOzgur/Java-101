package Giris;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double kilo, boy ,vuckitlend;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = girdi.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = girdi.nextDouble();

        vuckitlend = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vuckitlend);


    }
}

