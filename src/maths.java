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

    static int getGCD(int a, int b){
        //gcd(a,b)=gcd(b,a%b);
        while(b!=0)
        {
            int oldValueOfb =b;
            b=a%b;
            a=oldValueOfb;
        }
        int ans=a;
        return ans;
    }
    static int LCM(int a,int b){
        int gcd=getGCD(a,b);
        //gcd(18,12)=6
        int prod=a*b;
        // prod=216
        int lcm=prod/gcd;

        return lcm;
    }

    static boolean armstrong(int num)
    {
        int originalNum=num;
        int digit,sum=0;
        while (num!=0)
        {
            digit=num%10;
            int cubeDigit = digit*digit*digit;
            sum=sum+cubeDigit;
            num=num/10;
        }
        if(sum == originalNum)
        {
            return true;
        }else{
            return false;
        }
    }

    static boolean checkPerfectNumber(int num)
    {
        int sum=1;

        for (int i = 2; i*i<=num ; i++) {
            if(num % i==0)
            {
                int firstFactor=i;
                int secondFactor= num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
    static void printAllprime(int n)
    {
        for (int num = 2; num <=n ; num++) {
            boolean isPrime = checkPrime(num);
            if(isPrime == true)
            {
                System.out.println(num);
            }
        }
        // check wheather a no is prime or not
//        int num=5;
//        for (int i = 2; i*i <=num ; i++) {
//            if(num%i==0){
//                return false;
//            }
//        }
    }
    public static void main(String[] args) {

//        int num=455789145;
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

//        System.out.println(getGCD(18,12));
//        System.out.println(LCM(18,12));


//        System.out.println(armstrong(153));
//        System.out.println(checkPerfectNumber(6));
        printAllprime(100);























    }
}
