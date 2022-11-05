package ders07_NestedIfElse;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz : ");
        double kilo=scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giriniz : ");
        double boy=scan.nextDouble();

        double vk=(kilo*10000/(boy*boy));
        System.out.println("Vücut Kitle Endeksiniz : "+ vk);
        if (vk>30){
            System.out.println("Obez");
        } else if (vk>25) {
            System.out.println("kilolu");
        } else if (vk>20) {
            System.out.println("Normal");
        } else if (vk>0) {
            System.out.println("zayıf");
        } else {
            System.out.println("Yanlis giris");
        }
    }
}
