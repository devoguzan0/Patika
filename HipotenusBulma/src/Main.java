import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ilkKenar,ikinciKenar,ucuncuKenar,cevre,alan,u;

        System.out.print("İlk kenarı giriniz : ");
        ilkKenar = input.nextInt();

        System.out.print("İkinci kenarı giriniz : ");
        ikinciKenar = input.nextInt();

        System.out.print("Üçüncü kenarı giriniz : ");
        ucuncuKenar = input.nextInt();

        u = (ilkKenar+ikinciKenar+ucuncuKenar)/2;
        cevre = 2*u;
        System.out.println(cevre);

        alan = u*(u-ilkKenar)*(u-ikinciKenar)*(u-ucuncuKenar);

        System.out.println("Alan : " + Math.sqrt(alan));
    }
}