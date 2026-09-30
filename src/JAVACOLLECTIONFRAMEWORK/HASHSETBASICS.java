package JAVACOLLECTIONFRAMEWORK;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

public class HASHSETBASICS {
    public static void main(String[] args) {

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











        Set<Integer> st = new HashSet<>();
        // duplicate element ko hashset ek hi baar
        // store karta hai
        // ye order preserve nahi karta result random order me milega
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(30);
        st.add(30);
        st.add(30);
        st.add(40);
        st.add(40);
        st.add(40);

        System.out.println(st);





    }
}
