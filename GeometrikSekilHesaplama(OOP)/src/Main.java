import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String islemler = "İşlemler....\n"
                          +"1 - Kare alan hesapla\n"
                          +"2 - Üçgen alan hesapla\n"
                          +"3 - Daire alan hesapla\n"
                          +"Çıkış : q ";

        while (true){
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz : ");
            String sekil_turu = scan.nextLine();
            Sekil sekil = null;

            if(sekil_turu.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")){
                System.out.print("Karenin kenarı: ");
                int kenar = scan.nextInt();
                scan.nextLine();

                sekil = new Kare("Kare 1 " , kenar);   // Polymorphism
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1= scan.nextInt();
                System.out.print("Kenar 2 :");
                int kenar2= scan.nextInt();
                System.out.print("Kenar 3 :");
                int kenar3 = scan.nextInt();
                scan.nextLine();

                sekil = new Ucgen("Ucgen 1 " , kenar1,kenar2,kenar3);
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin Yarıçapı: ");
                int yaricap= scan.nextInt();
                scan.nextLine();

                sekil= new Daire("Daire 1", yaricap);
                sekil.alanHesapla();
            }
            else {
                System.out.println("Gerçersiz İşlem...");
            }
        }
    }
}
