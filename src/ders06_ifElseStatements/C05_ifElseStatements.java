package ders06_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        // kullanicidan yasini girmesini isteyin, 65 yas ve uzeri ise "Emekli olablirsin" yazdirin
        //yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        double yas=scan.nextDouble();

        if(yas>65){
            System.out.println("Emekli olabilirsin");
        }
        else {
            System.out.println("Emekli olmak icin "+ (65-yas) +" yil daha calismaniz gerekmektedir");
        }
    }
}
