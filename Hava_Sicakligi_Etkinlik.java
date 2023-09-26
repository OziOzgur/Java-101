package KosulluIfadeler;

import java.util.Scanner;

public class Hava_Sicakligi_Etkinlik {
    public static void main(String[] args) {

        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık giriniz: ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
            
        } else if (heat <= 25) {
            if (heat < 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.")
            }

        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
            
        }

    }
    }
