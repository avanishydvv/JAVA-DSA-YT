package JAVACOLLECTIONFRAMEWORK;

import java.util.Objects;

public class Student {
    public int roll;
    public String name;


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }



    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;


    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

}
