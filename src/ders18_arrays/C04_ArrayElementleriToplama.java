package ders18_arrays;

public class C04_ArrayElementleriToplama {
    public static void main(String[] args) {
        // verilen bir arraydeki pozitif sayilari toplayip sonucu bize donduren method
        int[] arr={3,-3,5,-7,-6,1,-2};
        System.out.println(arrayToplam(arr)); //9
    }
    public static int arrayToplam(int[] arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0){
                toplam += arr[i];
            }
        }

        return toplam;
    }

}
