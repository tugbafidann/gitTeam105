package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;

        /*
        Ternary operatoru tek basina kullanilmaz
        ternary bize sonuc verir bu sonucu ya direk yazdirmali ya da
        bir variable atanmalıdır.
         */


        //"tek sayi", "cift sayi" string oldugu için atayacagımız deger de String olmalı
        String sonuc=a%2==0? "Cift Sayi" : "Tek Sayi";


        /*
        ternarnin sonucunu bir variable ya atayacaksak true ve false durumlarinda uretilecek sonucun
        ayni data turunde olmasi gerekir.
        aksi halde  CTE(HATA) olusur


        ama ternary i sout icinde kullanirsak sonuların ayni
        data turunde olması sarti aranmaz
         */
        String sonuc2=a>10?"Buyuk sayi" :""+ 2*a; // CTE vermemesi icin Stringe cevirdik

        System.out.println(a>10 ? "Buyuk sayi" : 2*a);
    }
}
