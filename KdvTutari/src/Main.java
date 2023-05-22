import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();

        if(tutar>0 && tutar<=1000){
            double kdvTutar = tutar*18/100;
            double kdvliFiyat = tutar+kdvTutar;

            System.out.println("Kdv'li fiyat : " + kdvliFiyat);
            System.out.println("Kdv Tutarı : " + kdvTutar);
        }
        else{
            double kdvTutar = tutar*8/100;
            double kdvliFiyat = tutar+kdvTutar;

            System.out.println("Kdv'li fiyat : " + kdvliFiyat);
            System.out.println("Kdv Tutarı : " + kdvTutar);
        }
    }
}