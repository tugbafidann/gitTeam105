package ders14_MethodOlusturma;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan main method icinde
        // ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        // isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi ve Soyadinizi giriniz : ");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        System.out.println(isimSoyisimDondur(isim,soyisim));


    }
    public static String isimSoyisimDondur(String isim, String soyisim){
        String yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase() +
                " " +
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        return yeniIsimSoyisim;

    }

}
