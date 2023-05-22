import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,turkce,muzik;
        double ortalama,toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        toplam = mat + tarih + fizik + kimya + turkce + muzik;
        ortalama = toplam / 6;

        System.out.println("Ortalamanız : " + ortalama);

        System.out.println(ortalama > 60 ? "Geçtiniz" : "Kaldınız");
    }
}