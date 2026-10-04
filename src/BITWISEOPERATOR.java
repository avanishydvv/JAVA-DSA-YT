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

        int n = 12;
        if ((n&1) == 0 ) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }


        // kya jo no diya hai wo power of 2 hai
        // jaise 2^4=16




    }
}
