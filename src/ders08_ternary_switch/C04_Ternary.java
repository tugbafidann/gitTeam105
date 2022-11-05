package ders08_ternary_switch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin

       /* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar2== kenar1&& kenar2== kenar3 ?
                "Eskenar ucgen" : "Eskenar ucgen degil");
        */

        //Kulllanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz : ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);

    }
}
