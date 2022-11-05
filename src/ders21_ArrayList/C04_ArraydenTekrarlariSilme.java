package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        // verilen bir arraydeki tekrar eden sayilari
        // bir kere olacak sekilde arrayi düzenleyin

        int[] arr={1,2,3,5,3,5,2,5,1,2,4,5,3,4,5};

        //bu soruyu array ile yapmak cok zor.
        // bunun yerine bu arary in elemanlarını tektek inceleyip
        // tekrarsız olanları bir liste atalım.
        // en son o listdeki elementleri iceren bir array olusturup
        // yeni arrayi eski arraye deger olarak atayalim

        List<Integer> tekrarsizSayilar=new ArrayList<>();
        for (int i=0; i< arr.length;i++){

            if(!(tekrarsizSayilar.contains(arr[i]))){
                tekrarsizSayilar.add(arr[i]);
            }
            System.out.print(tekrarsizSayilar);
            arr=new int[tekrarsizSayilar.size()];


        }
    }
}
