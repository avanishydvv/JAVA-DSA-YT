package JAVACOLLECTIONFRAMEWORK;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HASHSETBASICS {
    public static void main(String[] args) {


        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Avanish");
        Student s2 = new Student(1, "Avanish");
        Student s3 = new Student(1, "Avanish");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);








//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        set1.add(10);
//        set1.add(20);
//        set1.add(30);
//        set1.add(40);
//
//        set2.add(30);
//        set2.add(40);
//        set2.add(60);
//        set2.add(70);
//
//        System.out.println(set1);
//        set1.retainAll(set2);   // intersection milega rsult me set 1 au set 2 ka
//        System.out.println(set1);
//        System.out.println(set2);
//
//
//        System.out.println(set2.containsAll(set1));











//        Set<Integer> st = new LinkedHashSet<>();
//        // duplicate element ko hashset ek hi baar
//        // store karta hai
//        // ye order preserve nahi karta result random order me milega
//
//        st.add(470);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(30);
//        st.add(30);
//        st.add(30);
//        st.add(40);
//        st.add(40);
//        st.add(40);
//
//        System.out.println(st);


//        Set<Integer> st = new TreeSet<>();
//
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//
//        System.out.println(st);




        // HASHSET -> o(1)
        // LinkedHashSet -> o(n)
        // TreeSet -> BST -> O(Logn)

    }
}
