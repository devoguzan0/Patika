import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mesafe,tutar;
        short tip,yas;

        System.out.print("Mesafeyi giriniz : ");
        mesafe = scan.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = scan.nextShort();

        System.out.print("Uçuş tipinizi seçiniz (1-Tek Yön / 2-Gidiş Dönüş) : ");
        tip = scan.nextShort();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            tutar = 0.10 * mesafe;
            if (yas < 12) {
                tutar *= 0.5;
            } else if (yas < 25) {
                tutar *= 0.9;
            } else if (yas > 65) {
                tutar *= 0.7;
            }
            if(tip == 2){
                tutar *= 0.8;
                tutar *= 2;
            }
            System.out.println("Toplam tutar: " + tutar + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}