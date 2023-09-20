package Giris;
import java.util.Scanner;
public class KdvOdev {
public static void main(String[]args){

    double tutar, kdvOrani = 0.18, kdvOrani2 = 0.08, kdvliTutar = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Tutar Giriniz: ");
    tutar = input.nextDouble();


    System.out.println(tutar < 1000 ? (tutar * kdvOrani) + tutar : (tutar * kdvOrani2) + tutar);
    System.out.println("KDV'li Tutar : " + kdvliTutar );


        }
}
