package ders06_ifElseStatements;

import java.util.Scanner;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin. Kadin 60 yas ve uzeri,
        // Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        // "Emekli olabilirsin" veya "Emekli olmak için daha ... yil daha calismalisiniz " yazdirin



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yas ve cinsiyetinizi giriniz : ");
        int yas=scan.nextInt();
        char cinsiyet=scan.next().charAt(0);

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65 && yas>15) {
            System.out.println("Emekli olmak için daha "+(65-yas)+ " yil daha calısmalisin");
        } else if (cinsiyet=='K' && yas<60 && yas>15) {
            System.out.println("Emekli olmak için daha "+(60-yas)+ " yil daha calismalisin");
        }else {
            System.out.println("Geçersiz giriş");
        }


    }
}
