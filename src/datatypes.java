public class datatypes {
    public static void main(String[] args){
        // Numeric DT - short,byte,int,long

        /****** data loss ***********/
//            long value1 = 12345678901;
//
//            int value2 = (int)value1;
//            System.out.println(value2);




        byte num1 = 126;

        long newNum = num1;

        System.out.println("New Num" + newNum);
        System.out.println(num1);

        short num2 = 5000;
        System.out.println(num2);

        int num3 = 50000;
        long num4 = 328923849;
        System.out.println(num3);
        System.out.println(num4);

        // floating DT

        float num5 = 3.3498354f;
        System.out.println(num5);

        double num6 = 3.1452546564655115;
        System.out.println(num6);

        // other - char, Boolean

        boolean eligibletovote = true;
        System.out.println(eligibletovote);

        char firstcharacter ='a';
        System.out.println("firstcharacter is:"+(char)(firstcharacter+2));




    }

}
