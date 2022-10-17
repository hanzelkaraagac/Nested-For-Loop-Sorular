package nestedloop;

import java.util.Scanner;

public class AsagidakiSekliEkranaYazdiranKoduYaziniz {
    public static void main(String[] args) {

        //Asagidaki sekli ekrana yazdiran kodu yaziniz.
        //       ****
        //       ****
        //       ****

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz");
        int satir = input.nextInt();
        System.out.println("Sutun sayisi giriniz");
        int sutun = input.nextInt();
        System.out.println("Karakter giriniz");
        char karakter = input.next().charAt(0);

        for (int i =1; i<=satir; i++) {

            for (int j =1; j<=sutun; j++) {

                System.out.print(karakter);
            }
            System.out.println();
        }


    }
}
