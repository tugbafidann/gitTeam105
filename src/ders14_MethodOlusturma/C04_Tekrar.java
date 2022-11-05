package ders14_MethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {
        int a=78;
        int b=20;
        // bu iki sayinin carpimini kod yazmadan konsola yazdirin
        System.out.println((C01_carpim.carpimMethodu(a, b)));

        String c="Nasil";
        String d="Yani";
        // bu iki Stringi aralarinda bir bosluk birakarak yaziniz
        System.out.println((C02_stringConcant.birlestirMethodu(c, d)));


        String e="Bu da mi oldu?";
        //e stringinin tersten yazdirin
        System.out.println((C03_StringTerseCevirme.stringTersCevirme(e)));

        // Bu cümleyi terse cevirin
        System.out.println(C03_StringTerseCevirme.stringTersCevirme("Bu cümleyi terse cevirin"));


    }
}
