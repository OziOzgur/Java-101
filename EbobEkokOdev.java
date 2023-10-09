package Donguler;

import java.util.Scanner;

public class EbobEkokOdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayı: ");
        int n1 = scan.nextInt();
        System.out.print("2. sayı: ");
        int n2 = scan.nextInt();

        int ebob = 1;
        int i = 1;
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        System.out.println("Ebob: " + ebob);

           int k = 1;
            while (k <= n1 * n2) {
                if (k % n1 == 0 && k % n2 == 0) {
                    break;
                }
                k++;
            }
        System.out.println("Ekok: " + k);
    }
}
