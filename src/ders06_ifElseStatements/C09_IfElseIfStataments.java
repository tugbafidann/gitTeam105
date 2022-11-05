package ders06_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStataments {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "geçersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli sayi"
        // bunun disindakiler için "buyuk sayi" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<0){
            System.out.println("Gecersiz sayi");
        } else if (sayi<10){
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");
        }
        else {
            System.out.println("buyuk sayi");
        }

    }
}
