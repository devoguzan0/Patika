import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ay,gun;

        System.out.print("Doğduğunuz ayı giriniz : ");
        ay = scan.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        gun = scan.nextInt();

        if(ay==1){
            if (gun>=1 && gun<=31){
                if (gun<22){
                    System.out.println("Oğlak burcu");
                }
                else{
                    System.out.println("Kova burcu");
                }
            }
        }
        else if(ay==2){
            if (gun>=1 && gun<=28){
                if (gun<20){
                    System.out.println("Kova burcu");
                }
                else{
                    System.out.println("Balık burcu");
                }
            }
        }
        else if(ay==3){
            if (gun>=1 && gun<=31){
                if (gun<21){
                    System.out.println("Balık burcu");
                }
                else{
                    System.out.println("Koç burcu");
                }
            }
        }
        else if(ay==4){
            if (gun>=1 && gun<=30){
                if (gun<21){
                    System.out.println("Koç burcu");
                }
                else{
                    System.out.println("Boğa burcu");
                }
            }
        }
        else if(ay==5){
            if (gun>=1 && gun<=31){
                if (gun<22){
                    System.out.println("Boğa burcu");
                }
                else{
                    System.out.println("İkizler burcu");
                }
            }
        }
        else if(ay==6){
            if (gun>=1 && gun<=30){
                if (gun<23){
                    System.out.println("İkizler burcu");
                }
                else{
                    System.out.println("Yengeç burcu");
                }
            }
        }
        else if(ay==7){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    System.out.println("Yengeç burcu");
                }
                else{
                    System.out.println("Aslan burcu");
                }
            }
        }
        else if(ay==8){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    System.out.println("Aslan burcu");
                }
                else{
                    System.out.println("Başak burcu");
                }
            }
        }
        else if(ay==9){
            if (gun>=1 && gun<=30){
                if (gun<23){
                    System.out.println("Başak burcu");
                }
                else{
                    System.out.println("Terazi burcu");
                }
            }
        }
        else if(ay==10){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    System.out.println("Terazi burcu");
                }
                else{
                    System.out.println("Akrep burcu");
                }
            }
        }
        else if(ay==11){
            if (gun>=1 && gun<=30){
                if (gun<23){
                    System.out.println("Akrep burcu");
                }
                else{
                    System.out.println("Yay burcu");
                }
            }
        }
        else if(ay==12){
            if (gun>=1 && gun<=31){
                if (gun<22){
                    System.out.println("Yay burcu");
                }
                else{
                    System.out.println("Oğlak burcu");
                }
            }
        }
        else
            System.out.println("Yanlış girdiniz.");

    }
}