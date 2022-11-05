package ders13FoorLoop_MethodOlusturma;

import java.util.Scanner;

public class C01_FoorLoop {
    public static void main(String[] args) {
        // Kullanicidan bir string alip tersine cevirerek yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("String ifade girin : ");
        String kelime= scan.nextLine();

        for (int i=kelime.length()-1; i>=0; i--){
            System.out.print(kelime.charAt(i));
        }
    }
}
