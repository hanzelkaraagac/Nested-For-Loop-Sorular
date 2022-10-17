package nestedloop;

public class AsagidakiSekliCizenKoduYaziniz04 {
    public static void main(String[] args) {

        /*

         Example: Asagidaki sekli cizen kodu yaziniz.


         *
         * *
         *   *
         *     *
         *********



         */


        for (int i = 1; i <= 10; i++) {//satir
            for (int j = 1; j <= 10; j++) {//sutun

                if ((i == 1 && j == 6) || (i == 2 && (j == 5 || j == 7)) || (i == 3 && (j == 4 || j == 8))
                        || (i == 4 && (j == 3 || j == 9)) || i == 5 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
