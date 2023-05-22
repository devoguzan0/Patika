import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yaricap,aci;
        double pi = 3.14,alan;

        System.out.print("Yarıçapı giriniz : ");
        yaricap = input.nextInt();

        System.out.print("Açıyı giriniz : ");
        aci = input.nextInt();

        alan = (pi*(yaricap*yaricap)*aci)/360;

        System.out.println("Alan : " + alan);
    }
}