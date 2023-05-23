import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,islem;


        System.out.print("İlk sayiyi giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci sayiyi giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("Toplama için 1");
        System.out.println("Çıkarma için 2");
        System.out.println("Çarpma için 3");
        System.out.println("Bölme için 4");
        System.out.print("İşleminizi seçiniz : ");
        islem = input.nextInt();


        switch (islem){
            case 1:
                System.out.println("Toplam : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Fark : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım : " + (sayi1*sayi2));
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                else {
                    System.out.println("Bölüm : " + (sayi1/sayi2));
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz.");
                break;
        }
    }
}