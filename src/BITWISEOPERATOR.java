public class BITWISEOPERATOR {
    public static void main(String[] args) {

        int a =5;
        int b= 6;

        System.out.println(a & b);  // bitwise AND
        System.out.println(a ^ b);      // bitwise XOR
        System.out.println(a | b);      // bitwise OR
        System.out.println(~a);         // bitwise NOT
        System.out.println(~b);
        System.out.println(a<<1);       // left shift
        System.out.println(a>>1);       // right shift


        System.out.println("EVEN or ODD number");
//        agar result 1 to odd aur agar 0 aaye to even

        int d = 12;
        if ((d&1) == 0 ) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }


        // kya jo no diya hai wo power of 2 hai
        // jaise 2^4=16
        // set bit ka count agar 1 hai to wo power of 2 hai

//        int n = 4;
//        int count = 0;
//        while (n != 0) {
//            if( (n&1) != 0){
//                // mujhe set bit mil gayi
//                count++;
//            }
//            n = n>>1;
//        }
//        System.out.println("Set Bit Count "+count);

        // power of 2 hai ya nahi hai
        // ye batata hai ye

        int n =15;
        if((n&(n-1) ) == 0) {
            System.out.println("Power of 2 hai");
        }
        else{
            System.out.println("Power of 2 nahi hai");
        }
    }
}
