package ders18_arrays;

public class C01_arrays {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        // arrayin bir elementine ulasmak ve update etmek icin

        System.out.println(arr[2]);

        arr[3]=20;
        System.out.println(arr[3]);
        // eleman sayisi
        System.out.println(arr.length); // 5


        // son elementi yazdirmak icin
        System.out.println(arr[arr.length-1]);


        // tüm elementleri yazdirmak icin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

        /*
        arrayin uzunlugu sonradan degistirilemez
        eger araryde olmayan bir indexe atama yapmak istersek ARRAYİNDEXOUTOFBOUNDSECEPTİON hatasi verir
        Bu hata Compile Time Error CTE degil Run time errordur

        arr[5]=35     olamaz hata verir
         */
    }
}
