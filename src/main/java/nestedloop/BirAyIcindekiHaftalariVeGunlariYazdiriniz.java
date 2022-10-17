package nestedloop;

public class BirAyIcindekiHaftalariVeGunlariYazdiriniz {
    public static void main(String[] args) {

         /*
            Example: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i = 1; i <5 ; i++) {

            System.out.println("Week" + i);

            for (int j = 1; j <8 ; j++) {

                System.out.println("Day" + j);
            }
        }

//        for (int a =1; a<13; a++){
//
//            System.out.println(a + ".ay");
//
//            for (int b =1; b<5; b++) {
//
//                System.out.println(b + ".hafta" + "\n");
//
//                for (int c=1; c<8; c++) {
//
//                    System.out.println(c + ".gun");
//                }
//            }
//        }
    }
}
