package Enum_and_wrapperClasses;

enum names {

    sanket("sanket", 25),
    aniket("aniket", 24);

    private String name;
    private int age;

    names(String name, int age){
          this.name = name;
          this.age = age;

    }

   String getName()
   {
       return name;
   }

   int getAge(){
        return age;
    }

}
