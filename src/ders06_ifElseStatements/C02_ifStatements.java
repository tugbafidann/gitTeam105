package ders06_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ucgen ise "Eskenar ucgen" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz :");
        int kenar1= scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3= scan.nextInt();

        if(kenar1==kenar2&& kenar2==kenar3){
            System.out.println("Eskenar Ucgen");
        }

    }
}
