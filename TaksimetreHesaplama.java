package Giris;
import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner girdi =new Scanner(System.in);
        System.out.print("Mesafeyi km olarak girin :");
        km = girdi.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam: " + total);




    }
}
