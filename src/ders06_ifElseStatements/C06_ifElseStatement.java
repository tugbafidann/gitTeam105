package ders06_ifElseStatements;

public class C06_ifElseStatement {
    public static void main(String[] args) {
        /*
        if else statementsda {} kullanmazsak
        hem if body si hem de else body si için sadece bir satir kabul eder

        sonraki satirlar if-else ile iliskilendirilmez her durumda calisir.
         */
        int not=20;
        if(not>=50){
            System.out.println("sinifi geçtin");
            System.out.println("yazın kafan rahat");
        }
        else {
            System.out.println("bu dersten kaldın");
            System.out.println("yaz okuluna bekleriz");
        }
    }
}
