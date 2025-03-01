package Encapsulation;

import jdk.jfr.Enabled;

public class AccessClass {

    public static void main(String[] args) {

        Encaps obj = new Encaps(2500, "sanket");

        System.out.println("Enitial salary of sanket is "+obj.getSalary());

        obj.setSalary(3000, true);
        obj.setName("sanket");

        int a = obj.getSalary();
        String name = obj.getName();

        System.out.println("Name : "+name+"\n"+"Salary : "+a);






    }

}

