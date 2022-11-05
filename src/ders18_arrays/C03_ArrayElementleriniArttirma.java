package ders18_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniArttirma {
    public static void main(String[] args) {
        // verilen bir int arrayinin tum elementlerini 2 arttirip bize donduren bir method olustur
        // Eski arrayi yeni haliyle kaydet

        int[] arr1={2,4,6,8};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr1[i]+2;

        }
        System.out.println(Arrays.toString(arr1));

        arr1=elementler2Arttir(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] elementler2Arttir(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr1[i]+2;
        }return arr1;
    }
}

