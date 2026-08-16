public class loop {
    public static void main(String[] args) {

        /* loops in java  */

        /* for loop */

        // for(int i=1;i<=5;i++){
        //     System.out.println("Value of i: " + i);
        // }

        // for(int i=1;i<=5;i++){
        //     System.out.println("Avanish yadav");
        // }

        // for(int i=1;i<=10;i+=2)
        // {
        //     System.out.println(i);
        // }
        // for(int i=2;i<=20;i+=2)
        // {
        //     System.out.println(i);
        // }

        /* nested for loop */

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++)
        // {
        //     System.out.print("* ");
        // }
        //     System.out.println();
        // }

        // for(int i=1;i<=3;i++)
        // {
        //     for(int j=1;j<=3;j++)
        //     {
        //         System.out.println("i= " +i +" , j = " +j);
        //     }
        // }


        /* Break and Continue Keyword */

        // for(int i=1;i<=10;i++)
        // {
        //     if(i==5)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= 10; i++) {
        // if (i == 5 || i==2) {
        //     continue ;
        // }
        // System.out.println(i);
        // }

        /* while loop */

//        int i= 1;
//
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

//        int i = 5;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

        /* *************** NESTED WHILE LOOP ******** */

        int i=1;
        while(i<=2){
            int j=1;
            while(j<=3){
                System.out.println("i="+ i +" , j = " + j);
                j++;
            }
            i++;
        }












    }
}
