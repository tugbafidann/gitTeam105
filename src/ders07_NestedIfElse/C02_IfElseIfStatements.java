package ders07_NestedIfElse;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldığınız ürün adedini giriniz : ");
        int urunAdedi= scan.nextInt();
        System.out.println("Lutfen aldıgınız ürünün liste fiyatını giriniz : ");
        double listeFiyati=scan.nextDouble();
        boolean kartVarMi=false;
        double toplamFiyat=0;

        if(kartVarMi&& urunAdedi>=10){
            toplamFiyat=urunAdedi*listeFiyati*(0.8);
            System.out.println("% 20 İndirimli Toplam Fiyat : "+toplamFiyat);
        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli Toplam Fiyat : "+ toplamFiyat);
        } else if (!kartVarMi && urunAdedi>=10) {
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli Toplam Fiyat : "+ toplamFiyat);
        } else if (!kartVarMi && urunAdedi<10) {
            toplamFiyat=urunAdedi*listeFiyati*(0.9);
            System.out.println("%10 indirimli Toplam Fiyat : "+ toplamFiyat);
        }

    }
}
