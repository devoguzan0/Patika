import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double elma,armut,domates,muz,patlican,tutar;

        System.out.print("Kaç kilo armut aldınız : ");
        armut = input.nextDouble();

        System.out.print("Kaç kilo elma aldınız : ");
        elma = input.nextDouble();

        System.out.print("Kaç kilo domates aldınız : ");
        domates = input.nextDouble();

        System.out.print("Kaç kilo muz aldınız : ");
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız : ");
        patlican = input.nextDouble();

        tutar = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);

        System.out.println("Toplam tutar : " + tutar);
    }
}