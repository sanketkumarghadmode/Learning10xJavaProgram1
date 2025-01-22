package Newpackageage;

public class InstancesOf_operator {

    public static void main(String[] args) {

        String src = "new";
        boolean flag = src instanceof String;
        System.out.println(flag);

        InstancesOf_operator obj = new InstancesOf_operator();
        boolean flag2 = obj  instanceof InstancesOf_operator ;
        
        
    }
}