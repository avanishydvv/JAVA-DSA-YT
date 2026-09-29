package JAVACOLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //List orr collection -> interface

        //Array List -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);

        System.out.println(list);
        // add all
        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list2.add(20);
        list.addAll(list2);

        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);


//        List<Integer> list = new ArrayList<>();
//
//        Collection<Integer> collection = new ArrayList<>();

    }

}










