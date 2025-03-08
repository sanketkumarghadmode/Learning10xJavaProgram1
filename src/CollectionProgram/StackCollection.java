package CollectionProgram;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {


    public static void main(String[] args) {

        Stack st = new Stack();

        st.push("sanket");
        st.push("aniket");
        st.push("abhijit");
        st.push("akshay");


//        System.out.println(st.peek());
//        System.out.println(st.push("Shubham"));
         System.out.println(st.pop());



        Iterator iterator = st.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());

        }
    }

}
