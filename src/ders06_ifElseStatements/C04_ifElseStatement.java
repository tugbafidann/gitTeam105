package ders06_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseStatement {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin,
        //girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
        char krk=scan.next().charAt(0);

        if(krk>='A' && krk<='Z'){
            System.out.println("Buyuk harf");
        }
        else {
            System.out.println("Buyuk harf degil");
        }

    }
}
