package polymorphism;

public class main {
    public static void main(String[] args) {

        calculator c = new calculator();
        System.out.println(c.add(2,5));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2,3,4,5.87));

    }
}
