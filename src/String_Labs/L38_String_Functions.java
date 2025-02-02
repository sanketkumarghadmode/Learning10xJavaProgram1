package String_Labs;

public class L38_String_Functions {

    public static void main(String [] args)
    {

        // if we create the string without the new keyword it will create the object in (SCP)
        String name  = "sanket";  // it will reuse the same object if the content is same
        String name2 = "sanket";
     // name2 = "Ghadmode";       // in this case it will create new object if the content is different
        String name3 = "Ghadmode";


        boolean flag = name == name2? true: false;// it will reuse the same object if the content is same
        System.out.println(flag);

        boolean flag2 = name2 == name3? true: false; // in this case it will create new object if the content is different
        System.out.println(flag2);

        // if we create the object using new keyword then it will create the object in (heap area)

        String  Name  = new String("sanket");
        String  Name1   = new String("sanket");

        System.out.println(Name == name); // false cause Name is present in heap area and name is present in SCP
        System.out.println(Name == Name1);// False cause it's created new object in heap area

        // == and equal()
        /*
        *  == it's operator which check whether both the object are referring
              the same memory location or not
        * equal() is method which compare the content is the same or not
        * */

        // String functions

        // charAt(0); Returns the char value at the specified index. An index ranges from 0 to length() - 1.
        // The first char value of the sequence is at index 0
        String fullname  = "sanket ghadmode";
        System.out.println(fullname.charAt(0)); // s

        //concat() it will Concatenate the specified string to the end of this string.
          String greeting = "Welcome! ";
          String result  = greeting.concat(fullname); // in this case concat will create the new object
          System.out.println(result);

        //contain() it will check the value and return true or false if the value is present in the given string
         System.out.println(result.contains("sanket"));
         System.out.println(result.contains("KK"));


         // equals() it will compare the content of string are same or not
            System.out.println(name.equals(name2));      //true
            System.out.println(fullname.equals(result)); // false

        // equalIgnoreCase  it will avoid to check the case sensitivity and compare two values of string
           String friend = "Sanket";
           System.out.println(friend.equalsIgnoreCase(name)); // true
           System.out.println(friend.equalsIgnoreCase(result)); // false; values are not the same

        // indexOf() it will Returns the index within this string of the first
        // occurrence of the specified character.
           System.out.println(fullname.indexOf('s'));

        // length() It will Returns the length of this string
        System.out.println(fullname.length());

        // replace()is used to replace every occurrence of a specific character or substring
        // in a string with another character or substring.
        System.out.println(fullname.replace('s','S'));
        System.out.println(fullname.replace("ghadmode","Ghadmode"));

        //The split() method is used to break a string into multiple parts
        // (substrings) based on a given regular expression (regex).

        String [] a = fullname.split(" ");
        System.out.println(a[0]);
        System.out.println(a[1]);

        // substring() The substring() method in Java is used to extract part of a string based
        // on specified start and end indexes.
        System.out.println(fullname.substring(0,6));

        // toLowerCase // covert the string into the lower case latter
        System.out.println(fullname.toLowerCase());

       //toUpperCase  covert the string into the upper case latter
        System.out.println(fullname.toUpperCase());

       //replaceAll() The replaceAll() method is used to replace all occurrences of a pattern defined
       // by a regular expression (regex) in a string.
        System.out.println(fullname.replaceAll("SANKET", "sanket"));

        //starWith()
        System.out.println(fullname.startsWith("S"));

        //endWith()
        System.out.println(fullname.endsWith("e"));

        //isEmpty()
        System.out.println(fullname.isEmpty());

        //trim
        String t = "   jay ho!   ";
        System.out.println(t.trim());

        // 18. compareTo()
        System.out.println(t.compareTo("   jay ho!   "));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("HO!"));

        // 20. lastIndexOf()
        System.out.println(fullname.lastIndexOf("o"));

        // 21. repeat()
        System.out.println(t.repeat(4));

        StringBuffer sb = new StringBuffer("Sanket"); // this class is mutable and modify the same object and it's thread safe
        sb.append("Ghadmode");
        System.out.println(sb);

        StringBuilder sbi = new StringBuilder("Sanket ");
        sbi.append("Ghadmode");
        System.out.println(sbi);



    }

}
