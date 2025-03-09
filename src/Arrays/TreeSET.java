package Arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSET {

    public static void main(String[] args) {


        TreeSet <Object> set = new TreeSet<>();
        set.add(0);
        set.add(234);
        set.add(71);
        set.add(21);


        Iterator iterator = set.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            
        }
    }
}
