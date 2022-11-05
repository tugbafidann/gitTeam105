package ders13FoorLoop_MethodOlusturma;

public class C05_NestedForLoopUcgen {
    public static void main(String[] args) {
        /*
        1
        12
        123
        1234
        12345 şeklinde kod yaziniz
         */

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");
        }
        /*
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
         */
        for (int i = 1; i <6 ; i++) {   // satir sayisini kontrol eder
            for (int j = 1; j <=i; j++) {  // ucgen olabilmesi icin i ye kadar gider
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
