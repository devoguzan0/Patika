import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;

        System.out.print("Sicaklik giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(sicaklik>5 && sicaklik<16){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik>15 && sicaklik<26){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}