package Giris;

import java.util.Scanner;

public class DaireProgOdev {
    public static void main(String[] args) {

        int r, merkezaci;
        double pi = 3.14, dilimalan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Merkez Açıyı Giriniz: ");
        merkezaci = inp.nextInt();

        System.out.print("r yi giriniz: ");
        r = inp.nextInt();

        dilimalan = (pi * (r * r) * merkezaci) / 360;
        System.out.print("Daire Dilimi Alanı = " + dilimalan);

    }
}
