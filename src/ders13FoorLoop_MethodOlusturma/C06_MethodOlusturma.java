package ders13FoorLoop_MethodOlusturma;

public class C06_MethodOlusturma {
    public static void main(String[] args) {
        // Metni buyuk harfe ceviren programi olustur

        String str="java muhtesemdir";
        String buyukStr=str.toUpperCase();
        System.out.println(str);  // java muhtesemdir
        System.out.println(buyukStr);   //JAVA MUHTESEMDİR

        // Buyuk harfler ile yazilan "S" icerir mi

        System.out.println(buyukStr.contains("S"));  // true
    }
}
