package generic_T;

public class G_DataType <T> {

    public static void main(String[] args) {

        G_DataType ob = new G_DataType("Name is Sanket");
        System.out.println(ob.getObj());

        G_DataType ob1 = new G_DataType(12.5);
        System.out.println(ob1.getObj());


    }


    T obj;

 G_DataType(T obj)
 {
     this.obj=obj;
 }

 public T getObj(){
     return this.obj;
 }


}
