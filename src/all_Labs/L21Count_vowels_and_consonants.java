package all_Labs;

public class L21Count_vowels_and_consonants {

  //  Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

  // need one string for loop and if condition two variables for storing the count

  //  need to check if the char in the string is matches with the vowles a e i o u

    public static void main(String[] args) {


        String name = "sanket aniket and Aksahy";
        int a = name.length();
        int NoOfVowel = 0;
        int consnants =0;

        for (int i = 0; i < a; i++) {
            char check = name.charAt(i);
            if (check=='a'|| check =='A'||check=='E'|| check =='e'||
                    check=='i'||check =='I'||check=='O'|| check =='o'||check =='U'||check =='u') {
                NoOfVowel++;
            } else if(check !=' '){
                consnants++;
            }
        }
        System.out.println("Number of Vowel found ="+NoOfVowel+"\n"+"Number of consnants found="+consnants);

}
}
