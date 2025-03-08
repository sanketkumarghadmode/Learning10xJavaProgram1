package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedArrayList {


    public static void main(String[] args) {


        List arr = new ArrayList();
        arr.add("1");
        arr.add("2");
        arr.add("3");

        List arr1 = new ArrayList();
        arr1.add("10");
        arr1.add("20");
        arr1.add("30");

        List Allarr = new ArrayList();
       Allarr.add(arr);
       Allarr.add(arr1);

       Iterator iterator = Allarr.iterator();

       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }







    }
}
