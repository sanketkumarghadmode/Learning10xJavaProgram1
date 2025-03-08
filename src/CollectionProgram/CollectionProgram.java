package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProgram {

    public static void main(String[] args) {

     //List l = List.of("Apple", "banana", "watermelon"); just the example of list static function
        // once it's created we can not remove and change it


        ArrayList <String> arr = new ArrayList();
        arr.add("All are Friends");
        arr.add("sanket");
        arr.add("aniket");
        arr.add("shubham");
        arr.add("Ganesh");
        for (String fr :arr)
        {
            System.out.println(fr);
        }

       Iterator iterator = arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
