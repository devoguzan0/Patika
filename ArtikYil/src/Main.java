import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yil;

        System.out.print("Yılı giriniz : ");
        yil = scan.nextInt();

        if (!(yil%400 == 0)){
            if (!(yil%100 == 0)){
                if(yil%4 == 0){
                    System.out.println("Artik yil.");
                }
                else
                    System.out.println("Artik yil değil.");
            }
            else
                System.out.println("Artik yil değil.");
        }
        else
            System.out.println("Artik yil.");
    }
}