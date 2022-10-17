package nestedloop;

public class AsagidakiSekliCizenKoduYaziniz03 {
    public static void main(String[] args) {

         /*

         Example: Asagidaki sekli cizen kodu yaziniz.

                             *
                             **
                             * *
                             *  *
                             *****


         */

        for (int i = 1; i <= 5; i++) {//satir
            for (int j = 1; j <= 5; j++) {//sutun
                if ((i == 1 && j == 1) || (i == 2 && (j == 1 || j == 2)) || (i == 3 && (j == 1 || j == 3)) || (i == 4 && (j == 1 || j == 4)) || (i == 5 && (j== 1 || j==2 || j==3 || j==4|| j==5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    }
