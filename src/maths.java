public class maths {

    static void printnum(int num){
        while(num>0){
            System.out.println(num%10);
            num=num/10;
        }
    }

    static int countNum(int num) {
        int count=0;
        while(num!=0)
        {
            int digit=num%10;
            count++;
            num=num/10;
        }
        return count;
    }

    static int sumNum(int num)
    {
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }

    static int reverseNum(int num)
    {
        int numrev=0;
        while(num!=0)
        {
            int digit=num%10;
            numrev=10*numrev+digit;
            num=num/10;
        }
        return numrev;
    }

    static void palindrom(int num){
        int numrev=0,n=num;
        while(num!=0)
        {
            int digit=num%10;
            numrev=10*numrev+digit;
            num=num/10;
        }
        if(n==numrev)
        {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
// prime or not
    static boolean checkPrime(int num)
    {
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0)
            {
                // not a prime
                return false;
            }
        }
//        for (int i = 2; i < num-1; i++) {
//            if(num%i==0)
//            {
//                // not a prime
//                return false;
//            }
//        }

        return true;
    }


    public static void main(String[] args) {

        int num=455789145;
       //printnum(num);
//       int ans =countNum(num);
//       System.out.println(ans);

//        int ans=sumNum(num);
//        System.out.println(ans);

//        int ans=reverseNum(num);
//        System.out.println(ans);
//        int n=121;
//        palindrom(n);
//        int n=11;
//        System.out.println(checkPrime(n));


























    }
}
