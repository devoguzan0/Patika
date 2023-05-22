import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar=10,mesafe;
        System.out.print("Gidilen mesafe : ");
        mesafe = input.nextInt();
        tutar += mesafe*(2.20);

        if(tutar<20){
            System.out.println("Ödenecek tutar : 20 TL'dir.");
        }
        else {
            System.out.println("Ödecenek tutar : " + tutar + " TL");
        }
    }
}