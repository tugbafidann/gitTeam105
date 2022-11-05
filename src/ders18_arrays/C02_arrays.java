package ders18_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        String[] arr={"Ali","Ulus","Nesrin"};
        // Bu arrayin tüm elementlerini aralarında bosluk bırakarak yazdirma

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        // bu arrayi array olarak yazdiralim

        System.out.println(arr);  // [Ljava.lang.String;@6108b2d7
        // array bir obje / non-primitive data turunden olduğu için referansını yazdirmis olur

        System.out.println(Arrays.toString(arr));
    }
}
