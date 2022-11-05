package ders30;

public class EChild extends DParent {
    /*
    java daki inneritance in insanlardan en buyük farki:
    insanlardan parent child edinebilir ama chid paret ini secemez
    java da ise tam tersidir
      - siz bir class oluşturdugumuzda daha once olusturulmus classlardan
         tum ozelliklerini inherit olmak istediginiz class ı PARENT EDİNİRİZ


     Bir class baska bir class ı inherit etmek istediğimizde extends keyword
     ile bunu deklare eder
     */
    public static void main(String[] args) {
        EChild child1=new EChild();
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnought=false;

    }
}
