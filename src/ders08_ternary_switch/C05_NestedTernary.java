package ders08_ternary_switch;

import java.util.Scanner;

public class C05_NestedTernary {
    public static void main(String[] args) {
        // Ornek : Kullanicidan bir tamsayi alin.
        //	Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //	Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi > 0) {
            // cift sayi veya cift sayi degli secenekelrinden uyfun olani yazdirin
            System.out.println((sayi%2==0 ? "Cift sayi" : "Cift sayi degil"));
        } else {

            // 3 basamakli sayi veya 3 basamakli sayi degil seceneklerinden uygun olani yazdirin
            System.out.println(sayi<-99 && sayi>-1000 ?"Uc basamakli" : "Uc basamakli degil");
        }


        //TERNARY OLARAK AYNI KODU YAZALİM

        String sonuc=sayi>0
                ?
                sayi%2==0 ? "Cift sayi" : "Cift sayi degil"
                :
                sayi<-99 && sayi>-1000 ?"Uc basamakli" : "Uc basamakli degil";

        System.out.println(sonuc);


    }
}
