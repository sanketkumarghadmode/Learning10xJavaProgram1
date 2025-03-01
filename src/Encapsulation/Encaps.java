package Encapsulation;

public class Encaps {


    private int salary;
    private String name;

    public Encaps(int salary, String name)
    {
        this.salary=salary;
        this.name=name;
    }

    public void setSalary(int salary, boolean hr)
    {
        if(hr==true) {
            this.salary = salary;
        }
        else {
            System.out.println("You can not change the salary");
        }
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}