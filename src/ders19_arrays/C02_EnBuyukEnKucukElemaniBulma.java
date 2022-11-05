package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElemaniBulma {
    public static void main(String[] args) {
        // Verilen bir int array de en kucuk ve buyuk
        // sayilari yazdiran methodu olustur.

        int[] arr={3,8,1,5,2,9};
        enBuyukEnKucukElementYazdir(arr);

    }

    public static void enBuyukEnKucukElementYazdir(int[] arr){
        Arrays.sort(arr);

        System.out.println("En Buyuk Element : "+ arr[arr.length-1]);
        System.out.println("En Kucuk Element : "+ arr[0]);
    }
}
