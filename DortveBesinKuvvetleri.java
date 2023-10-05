package Donguler;

import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();

        System.out.print("4'ün Kuvvetleri: ");
        for (int i = 1; i <= n ; i *= 4) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.print("5'in Kuvvetleri: ");
        for (int k = 1; k <= n; k *= 5) {
            System.out.print(k + ", ");

        }
    }
}
