package Giris;

import java.util.Scanner;

public class HipotenusOdev {
    public static void main(String[] args) {

        int a,b,c;
        double alan, u;
        Scanner girdi = new Scanner(System.in);
        System.out.print("a kenarı: ");
        a = girdi.nextInt();
        System.out.print("b kenarı: ");
        b = girdi.nextInt();
        System.out.print("c kenarı: ");
        c = girdi.nextInt();

        u = (double) (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Alan = " + alan);


    }
}
