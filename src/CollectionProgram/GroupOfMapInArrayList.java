package CollectionProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfMapInArrayList {

    public static void main(String[] args) {

        HashMap<Object,Object> info = new HashMap();
        info.put("name","Sanket");
        info.put("iD" , 1234);

        HashMap<Integer,String> info2 = new HashMap();
        info2.put(1,"Aniket");
        info2.put(2 ,"4321");

        HashMap<Object, Object> lists = new HashMap<>();
        lists.putAll(info);
        lists.putAll(info2);

        System.out.println(lists);


        List list = new ArrayList();
        list.add(info);
        list.add(info2);

        System.out.println("===================================================================");

        for (Object arr: list){

            System.out.println(arr);
        }





    }
}
