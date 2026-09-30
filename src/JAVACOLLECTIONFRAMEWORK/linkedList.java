package JAVACOLLECTIONFRAMEWORK;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {

        // linked list

        List<Integer> list = new LinkedList<>();

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
        List<Integer> list2 = new LinkedList<>();
        list2.add(600);
        list2.add(700);
        list2.add(200);
        list.addAll(list2);

        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("Printing list2: "+ list2);
        list2.clear();
        System.out.println(list2);

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext() ){
            System.out.println("Element: "+ iterator.next() );

        }







        List<Integer> list3 = new LinkedList<>();

        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);

        System.out.println(list3.get(3));

        System.out.println("Before set "+ list3);
        list3.set(0,110);  // isme set(index,value) karenge

        System.out.println("After set "+ list3);

        // toArray
        Object[] arr =  list3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        // contains ye check karta hai ki element
        // list me present hai ya nahi hai

        System.out.println(list3.contains(110));


        list.add(12);
        list.add(6);
        System.out.println("Printing Entire List "+ list);
        // sort an array list
        Collections.sort(list);
        System.out.println("Printing Entire List "+ list);

        // HW -> how can we sort nin descending order



    }
}
