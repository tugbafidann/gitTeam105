package ders07_NestedIfElse;

import java.util.Scanner;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println(("Lutfen cinsiyet bilgisini K/E şeklinde giriniz : "));
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas= scan.nextInt();

        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken olsun
        if ((cinsiyet=='k' || cinsiyet=='K')){
            if (yas<15){
                System.out.println("Hatalı giris yaptiniz ");
            } else if (yas<60) {
                System.out.println("Emekli olmak için daha "+(60-yas)+" yil vardır");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }
        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas<15){
                System.out.println("Hatalı giris yaptiniz ");
            } else if (yas<65) {
                System.out.println("Emekli olmak için daha "+(65-yas)+" yil vardır");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else {
            System.out.println("Yanlis giris yaptiniz!!!!");
        }
    }
}
