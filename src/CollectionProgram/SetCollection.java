package CollectionProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args) {

        Set set =  new HashSet();
        set.add("Sanket");
        set.add("Aniket");
        set.add("Shubham");
        set.add("Ganesh");

       // System.out.println(set.remove(4));

        System.out.println(set.isEmpty());
    for(Object fr:set)
    {
        System.out.println(fr);
    }

        System.out.println(set.size());
        System.out.println(set.add("Hritik"));
        System.out.println(set.isEmpty());


         }

    }
    