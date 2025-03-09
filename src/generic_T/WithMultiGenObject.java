package generic_T;

public class WithMultiGenObject <T>{

    T name;
    T age;
    T salary;

    WithMultiGenObject(T name, T age, T salary){
        this.name = name;
        this.age = age;
        this.salary = salary;



    }

    public T GetDetail(){

        return (T) (name+" "+age+" "+salary);
    }

    public static void main(String[] args) {

        WithMultiGenObject obj = new WithMultiGenObject("Sanket", 25, 65000.00D);
        System.out.println(obj.GetDetail());

    }

}
