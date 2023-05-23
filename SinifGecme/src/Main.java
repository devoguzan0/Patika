import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik,ortalama,toplam=0,sayac=0;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if(mat>0 && mat<=100){
            toplam+=mat;
            sayac++;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if(turkce>0 && turkce<=100){
            toplam+=turkce;
            sayac++;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if(fizik>0 && fizik<=100){
            toplam+=fizik;
            sayac++;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if(kimya>0 && kimya<=100)
        {
            toplam+=kimya;
            sayac++;
        }
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if(muzik>0 && muzik<=100){
            toplam+=muzik;
            sayac++;
        }
        ortalama = toplam/sayac;

        if(ortalama>=55)
            System.out.println("Ortalamanız : "+ ortalama + ". Sınıfı geçtiniz.");
        else
            System.out.println("Ortalamanız : " + ortalama + ". Sınıfta kaldınız.");
    }
}