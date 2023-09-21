package Giris;

import java.util.Scanner;

public class Manav_Kasa_Prog {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, tutar;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        armut = girdi.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        elma = girdi.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        domates = girdi.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        muz = girdi.nextDouble();
        System.out.print("Patlican Kaç Kilo : ");
        patlican = girdi.nextDouble();


        tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);

        System.out.print("Toplam Tutar : " + tutar);

    }
}