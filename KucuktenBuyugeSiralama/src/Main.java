import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("1.sayiyi giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2.sayiyi giriniz : ");
        sayi2 = input.nextInt();

        System.out.print("3.sayiyi giriniz : ");
        sayi3 = input.nextInt();

        if(sayi1>sayi2 && sayi1 > sayi3){
            if (sayi2>sayi3){
                System.out.println(sayi1 + " > " + sayi2 +" > " + sayi3);
            }
            else if (sayi3>sayi2){
                System.out.println(sayi1 + " > " + sayi3 +" > " + sayi2);
            }
            else{
                System.out.println("Sayılar eşit de olabilir. O durumu karşılaştırmadık.");
            }
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.println(sayi2 + " > " + sayi1 +" > " + sayi3);
            }
            else if(sayi3>sayi1) {
                System.out.println(sayi2 + " > " + sayi3 +" > " + sayi1);
            }
            else{
                System.out.println("Sayılar eşit de olabilir. O durumu karşılaştırmadık.");
            }
        }
        else if (sayi3>sayi2 && sayi3>sayi1){
            if (sayi1>sayi2){
                System.out.println(sayi3 + " > " + sayi1 +" > " + sayi2);
            }
            else if(sayi2>sayi1) {
                System.out.println(sayi3 + " > " + sayi2 +" > " + sayi1);
            }
            else{
                System.out.println("Sayılar eşit de olabilir. O durumu karşılaştırmadık.");
            }
        }
        else{
            System.out.println("Sayılar eşit de olabilir. O durumu karşılaştırmadık.");
        }
    }
}