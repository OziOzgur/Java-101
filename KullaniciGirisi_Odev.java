package KosulluIfadeler;

import java.util.Scanner;

public class KullaniciGirisi_Odev {
    public static void main(String[] args) {

        String username, password, select, newpassword;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        username = scanner.nextLine();

        System.out.print("Şifreniz: ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");

        } else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi Sıfırlamak ister misiniz?\nEvet:E\nHayır:H");
            System.out.print("Seçiminiz: ");
            select = scanner.nextLine();

            if (select.equals("E") || select.equals("e")) {
                System.out.println("Lütfen Eski Şifrenizi Kullanmayın.\nYeni Şifre Giriniz: ");
                newpassword = scanner.nextLine();
                if (newpassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı. Lütfen Yeni Şifre Giriniz!:");
                } else
                    System.out.println("Şifre Oluşturuldu.");

            } else {
                System.out.println("Şifre Oluşturmadınız.");



            }
        }
    }
}
