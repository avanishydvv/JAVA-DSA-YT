public class app {

    public static void main(String[] args)  {

        // default ctor
//        student A = new student();
//        A.id =1;
//        A.age = 14;
//        A.name = "Ram";
//        A.nos=5;
//
//        System.out.println(A.name);
//        System.out.println(A.nos);
//        System.out.println(A.id);
//        System.out.println(A.age);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        // parameterised ctor

        student A = new student(25,12,"Avanish",5);
//
//        System.out.println(A.name);
//        System.out.println(A.nos);
//        System.out.println(A.id);
//        System.out.println(A.age);
//
//        A.bunk();
//        A.study();
//        A.sleep();


        // copy ctor

        student B = new student(A);

        System.out.println(B.name);
        System.out.println(B.nos);
        System.out.println(B.id);
        System.out.println(B.age);

        B.bunk();
        B.study();
        B.sleep();







    }
}
