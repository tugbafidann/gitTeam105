package ders06_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // kenar uzunlukları 0 veya negatif ise gecersiz kenar uzunlugu yazdirin
        // ucgen eskenar ucgen ise "Eskenar ucgen" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz :");
        int kenar1= scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3= scan.nextInt();

        if(kenar1<=0 || kenar2>=0 || kenar3<=0){
            System.out.println("Geçersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");

        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
