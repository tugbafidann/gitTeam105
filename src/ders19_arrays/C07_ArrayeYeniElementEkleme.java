package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {

    public static void main(String[] args) {
        int[] arr={2,4,6};
        // Bu arraye 4. bir element olarak 8 ekleyelim
        /*
        Var olan bir ararye yeni bir eleman eklenemez
        ama
        yeni deger atanabilir.

        Once int[] arr2={2,4,6,8} seklinde yeni bir array olusturup
        arr ye atayabiliriz
         */
        // yeni array olusturup arr2 e konulacak
        // dataların turu uzunlugu ise eski arrayin uzunlugunun 1 fazlasi

        int[] arr2=new int[arr.length+1];
        for (int i=0; i< args.length;i++){
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2));

        //arr array ine yeni deger aolarak olusturdugumuz arr2 atayacağız
        arr=arr2;

        System.out.println("arr son hali : "+ Arrays.toString(arr));

    }
}
