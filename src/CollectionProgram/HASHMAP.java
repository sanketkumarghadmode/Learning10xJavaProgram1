package CollectionProgram;

import java.util.*;

public class HASHMAP {

    public static void main(String[] args) {

       HashMap<Object,Object> map = new HashMap();

       map.put("name","Sanket");
       map.put("Id", 721); //  it's not allow the duplicate key value
       map.put(null,null); //  only one null Key allowed
       map.put(null,null);
       map.put("Id",null); //  we can have multiple null value
       map.put("Id1", 721);
       map.put("Phone",7447818516l);

       for(Map.Entry<Object, Object> iteam: map.entrySet())
       {
           System.out.print(iteam.getKey()+" = ");
           System.out.println(iteam.getValue());
       }




}

    }

