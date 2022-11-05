package ders13FoorLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_StringiTersineCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen string bir ifade girin : ");
        String input= scan.nextLine();
        String tersInput="";
        for (int i=input.length()-1; i>=0;i--){

            tersInput += input.substring(i,i+1);

        }
        System.out.println("Stringin Ters Cevrilmis Hali : "+tersInput);
    }
}
