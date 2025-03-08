package CollectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClassmethod {

    public static void main(String[] args) {

        List number = new ArrayList();

        number.add(4);
        number.add(10);
        number.add(3);
        number.add(5);

        Collections.sort(number);
        System.out.println(number);

        Collections.sort(number.reversed());
        System.out.println(number);

    }

}
