package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayYeniDegerAtama {

    public static void main(String[] args) {
        String str="java";

        str="hava";
        /*
        Var olan bir arrayin uzunlugu degistirilemez
        AMA
        Var olan bir arraye yeni bir array degeri atanabilir.
         */

        //1-Var olan bir arrayi yeni bir deger olarak atayabiliriz
        String[] arr1={"Ali","Veli"};
        String[] arr2={"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1));  //[A, B, C]

        //2-- Istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));

        //3-- Yeni olusturulan bir arraye {} icinde deger yazarak atama yapabiliriz
        //Ancak var olan bir arraye yeni deger ataması icni {} KULLANILMAZZZ

        // arr1={"g","h"} OLMAZ
    }
}
