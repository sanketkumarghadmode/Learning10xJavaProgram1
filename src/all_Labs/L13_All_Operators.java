package all_Labs;

public class L13_All_Operators {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 10, b = 5;
        int x = 15, y = 20;
        boolean p = true, q = false;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Assign
        System.out.println("c = a: " + c);
        c += b; // c = c + b
        System.out.println("c += b: " + c);
        c -= b; // c = c - b
        System.out.println("c -= b: " + c);
        c *= b; // c = c * b
        System.out.println("c *= b: " + c);
        c /= b; // c = c / b
        System.out.println("c /= b: " + c);
        c %= b; // c = c % b
        System.out.println("c %= b: " + c);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("--a: " + (--a)); // Pre-decrement
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("a--: " + (a--)); // Post-decrement

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (x > y) ? x : y;
        System.out.println("Max of x and y: " + max);

        // 8. Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
