public class student {

    // Attributes

    public int id;
    public int age;
    public String name;
    public int nos;


    // Default constructor(ctor)//attributrs => garbage

//    public student(){
//        System.out.println("Student default ctor Called");
//    }

    // parameterised ctor
    public student(int id, int age,String name,int nos){
        System.out.println("Student default ctor Called");
        this.id=id;
        this.name=name;
        this.age=age;
        this.nos=nos;
    }

    // Copy  ctor
    public student(student srcobj){   // srcobj -> A
        System.out.println("Student Copy ctor Called");
        this.id= srcobj.id;
        this.name= srcobj.name;
        this.age= srcobj.age;
        this.nos= srcobj.nos;
    }


    // Methods / behaviour
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }
}
