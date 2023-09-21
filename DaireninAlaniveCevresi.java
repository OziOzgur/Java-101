package Giris;

import java.util.Scanner;

public class DaireninAlaniveCevresi {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = girdi.nextInt();

        double cevre = 2 * pi * r;
        double alan =  pi * r * r;
        System.out.println("Dairenin Çevresi= " + cevre);
        System.out.print("Dairenin Alanı= " + alan);

    }
}
