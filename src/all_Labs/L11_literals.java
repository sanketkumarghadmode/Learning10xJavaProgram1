package all_Labs;

public class L11_literals {
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 100;        // Decimal literal
        int binary = 0b1101;      // Binary literal
        int octal = 075;          // Octal literal
        int hex = 0x1A;           // Hexadecimal literal
        long largeNumber = 1_000_000_000L; // Underscore for readability

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Long with underscores: " + largeNumber);

       //Floating-Point Literals
        double pi = 3.14159;          // Double literal
        float gravity = 9.8f;         // Float literal (must include 'f')
        double scientific = 1.2e3;    // Scientific notation

        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Scientific Notation: " + scientific);

        //Character Literals
        char letter = 'A';           // Single character
        char unicode = '\u0041';     // Unicode character ('A')
        char new_line = '\n';          // Newline new_line sequence
        char tab = '\t';
        char Backspace = '\b';
        char Carriage_return = '\r';

        System.out.println("Letter: " + letter);
        System.out.println("Unicode: " + unicode);
        System.out.print("Escape sequence example:" + new_line + "New line!");

        System.out.print("sanket"+tab+"ghadmode"); // add the four space

        System.out.print("sanket"+Backspace+"ghadmode"); // remove the one character

        System.out.print("sanket"+Carriage_return+"ghadmode"); // remove the one word


        //String Literals
        String greeting = "Hello, World!";  // String literal
        String multiline = "Line 1\nLine 2"; // String with escape sequence

        System.out.println(greeting);
        System.out.println(multiline);

       // Boolean Literals
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

       //Null Literal
        String str = null;          // Reference variable with null
        if (str == null) {
            System.out.println("The string is null.");
        }

        str = "Hello, Java!";
        System.out.println("Now, the string is: " + str);



    }

    }

