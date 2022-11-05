package ders13FoorLoop_MethodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {
    // Kullanicidan 2 sayi alip sonucu yazdiran methodu olusturunuz

      isteToplaYazdir();
    }
    public static void isteToplaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
    }

}
