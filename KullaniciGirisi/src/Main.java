import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, yeniSifre;
        String _sifre = "test";
        String secim;

        System.out.print("Kullanıcı adınızı giriniz : ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("test") && sifre.equals(_sifre)) {
            System.out.println("Giriş başarılı.");

        } else if (kullaniciAdi.equals("test") && sifre != _sifre) {
            System.out.println("Şifre yanlış. Şifrenizi değiştirmek ister misiniz ?");
            System.out.println("Evet için 1 e basınız.");
            System.out.println("Hayır için 2 e basınız.");
            System.out.print("Seçiminizi belirtin : ");
            secim = input.nextLine();


            if (secim.equals("1")) {

                while (secim.equals("1")) {
                    System.out.print("Yeni şifrenizi giriniz : ");
                    yeniSifre = input.nextLine();

                    if (yeniSifre.equals(_sifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                        secim = "2";
                    }
                }
            } else if (secim.equals("2")) {
                System.out.println("Şifrenizi değiştirmemeyi seçtiniz.");
            } else {
                System.out.println("Geçerli bir seçim yapınız.");
            }
        }
    }
}