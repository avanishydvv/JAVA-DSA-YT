package ABSTRACTION;

abstract class Bird{
    abstract void fly();

    abstract void eat();
}

class sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }
}

class Crow extends Bird {
    @Override
    void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    void eat() {
        System.out.println("Crow is eating");
    }
}



public class main {
    public static void main(String[] args) {
        Bird b = new sparrow();
        b.eat();
        b.fly();

        b = new Crow();
        b.fly();
        b.eat();

    }
}
