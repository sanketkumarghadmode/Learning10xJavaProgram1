package CollectionProgram;

import java.util.Hashtable;
import java.util.Map;

public class hashTAble {

    public static void main(String[] args) {


        Map <Object, Object> map = new Hashtable<>();
        map.put("Name", "Sanket");
        map.put("Mobile number", 7447818516l);
        map.put("Age" , 25);


        for(Map.Entry<Object,Object>iteam: map.entrySet()){

            System.out.print(iteam.getKey()+" :- ");
            System.out.println(iteam.getValue());
        }


        boolean check  = map.isEmpty();
        System.out.println(check);



    }
}
