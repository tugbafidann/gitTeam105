package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int[][] arr={{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};
        System.out.println(arr.length);  // 5
        System.out.println(arr[2].length); //[5,6,7]  lengh=>3
        System.out.println(arr[1]);  //[1,2] direk yazdirilamaz, java referansını yazdırmali
        System.out.println(Arrays.toString(arr[1])); //[1,2]

        System.out.println(Arrays.deepToString(arr)); // TUM ARRAY YAZDİRMAK İSTERSEK
        System.out.println(arr[arr[3][0]]); // hata verir böyle bir index yok
    }
}
