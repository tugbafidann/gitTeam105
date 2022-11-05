package ders06_ifElseStatements;

import java.util.Scanner;

public class C01_ifStatements {

    public static void main(String[] args) {
         //Kullanicidan bir harf alin harf ile baslayan bir ay varsa yazdirin.
        // Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini girin : ");
        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='o' ||  ilkHarf=='O') {
            System.out.println("Ocak");
        }
        if (ilkHarf=='ş' ||  ilkHarf=='Ş') {
            System.out.println("Şubat");

        }
        if (ilkHarf=='m' ||  ilkHarf=='M') {
            System.out.println("Mart veya Mayıs");
        }
        if (ilkHarf=='n' ||  ilkHarf=='N') {
            System.out.println("Nisan");
        }
        if (ilkHarf=='h' ||  ilkHarf=='H') {
            System.out.println("Haziran");
        }
        if (ilkHarf=='t' ||  ilkHarf=='T') {
            System.out.println("Temmuz");
        }
        if (ilkHarf=='a' ||  ilkHarf=='A') {
            System.out.println("Agustos veya Aralık");
        }
        if (ilkHarf=='e' ||  ilkHarf=='E') {
            System.out.println("Eylül veya Ekim");
        }
        if (ilkHarf=='k' ||  ilkHarf=='K') {
            System.out.println("Kasim");
        }
    }
}
