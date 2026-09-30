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
//
//      this method is not correct

//        LinkedList<Integer> newlist = (LinkedList<Integer>)list.clone();

//        System.out.println("Printing Entire new List "+newlist);
//
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);
//
//        System.out.println(newlist.isEmpty());
//        System.out.println(marks.isEmpty());
//
//        System.out.println(newlist.indexOf(40));


//        System.out.println(list.indexOf(40));


        System.out.println(list.lastIndexOf(40));

        System.out.println("Printing Entire List "+ list);
        list.remove(3);
//        list.remove(3);
//        list.remove(3);

        list.addFirst(1050);
        list.addLast(999);

        System.out.println("Printing Entire List "+ list);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(99);
        ll.addFirst(95);
        ll.addFirst(78);

        ll.addLast(458);

        System.out.println("Printing Entire List before poll "+ ll);
        System.out.println(ll.poll());
        System.out.println("Printing Entire List after poll "+ ll);
        ll.peek();
        System.out.println("Printing Entire List  after peek"+ ll);

        ll.addLast(69);

        System.out.println("Printing Entire List  "+ ll);

        // offer ll me right me elemnt add kar deta hai addlast() ke jaise

        ll.offer(59);
        System.out.println("Printing Entire List  "+ ll);


        // vector list
        // vector list me sab methods same rahenge lagbagh lagbhag
        Vector<Integer>  v = new Vector<>();
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);

        v.addFirst(50);
        System.out.println("Printing Entire Vector  "+ v);


        Stack<Integer>  st = new Stack<>();

        System.out.println("Printing Entire Stack  "+ st);

        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);

        System.out.println("Printing Entire Stack  "+ st);

        st.pop();

        System.out.println("Printing Entire Stack  "+ st);


        System.out.println("Printing Entire Stack  "+ st);

        Stack<String> str = new Stack<>();

        str.push("Avanish");
        str.push("Amit");
    }
}
