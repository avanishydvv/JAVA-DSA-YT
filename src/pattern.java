//import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        /* **************** Pattern Printing LEC 11*********************** */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
// pattern 1
//        for(int i=1;i<=4;i++)
//        {
//            for (int j = 1; j <=4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 2
//
//        for (int i = 1; i <= 3 ; i++) {
//            for (int j = 1; j <= 5 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//

        // pattern 3
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
















    }

}
