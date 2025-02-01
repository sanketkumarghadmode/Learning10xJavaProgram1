package all_Labs;


public class L28_Count_Of_Vowels_and_Consonants {
    public static void main(String [] args){


        String name = "sanket is the good person";

        int size = name.length();
        int count = 0;
        int count2 = 0;
        //name = name.toLowerCase();


        for(int i = 0; i<size; i++)
        {

            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
            {
                count++;
            }
            else if(name.charAt(i)!=' ')
            {
                count2++;
            }
        }

        System.out.println("No of Vowels in string"+" "+count);
        System.out.println("No of Consonans in string"+" "+count2);
    }

}
