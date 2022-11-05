package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Ali";

        // verilen iki metin birbiri ile ayni ise "metinler ayni"
        // farkli ise "metinler farkli" yazdirin

        if(str1.equals(str2)){
            System.out.println("Metinler ayni");
        }else {
            System.out.println("Metinler farkli");
        }

        System.out.println(str1.equals(str2) ? "Metinler Ayni" : "Metinler Farkli");
    }
}
