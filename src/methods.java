public class methods {
    // declaration/definition
    static void print2kaTable()
    {
        for (int i = 1; i <= 10 ; i++) {
            int ans=2*i;
            System.out.println(ans);
        }
    }

   static void multiply(int a, int b)
    {
        int ans=a*b;
        System.out.println(ans);
        return;
    }

    static void sum(int x,int y)
    {
        System.out.println("sum:"+ (x+y) );
    }
    static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    static int add(int a,int b,int c)
    {
        int sum=a+b+c;
        return sum;
    }
    static void solve(int num){
        System.out.println("inside solve:"+num);
        num=num+10;
        System.out.println("inside solve: "+ num);
    }
    public static void main(String[] args) {

        /* Methods in java  */
//        System.out.println("hi");
//        print2kaTable();
//        System.out.println("bye");
//          sum(5,10);
//        multiply(5,6);
//        System.out.println(add(2,3));
//        int result = add(2,5);
//        System.out.println(result);
//
//        int ans = add(2,5,6);
//        System.out.println(ans);
        int num = 5;
        System.out.println("inside main: " + num);
        solve(num);
        System.out.println("inside main: " + num);


















    }
}
