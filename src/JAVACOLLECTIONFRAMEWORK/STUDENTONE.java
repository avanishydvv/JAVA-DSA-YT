package JAVACOLLECTIONFRAMEWORK;

public class STUDENTONE {
    public int age;
    public String name;
    public int weight;




    public STUDENTONE(int age, String name ,int weight) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "STUDENTONE{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


