package polymorphism;

public class main {
    public static void main(String[] args) {

//        calculator c = new calculator();
//        System.out.println(c.add(2,5));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.87));


        // run time polymorphism

//        circle c= new circle();
//        doDrawingStuff(c);

//
//        rect r= new rect();
//        doDrawingStuff(r);
//
        // downcasting
//
//        circle c= new circle();
//        doDrawingStuff(c);

        rect r = new rect();
        doDrawingStuff(r);


    }

    public static void doDrawingStuff(shape s){
        s.draw();
        circle c = (circle)s;
        c.draw();
    }
}
