package Operators;

public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        int andResult = a & b;
        System.out.println("Bitwise AND (&) of " + a + " and " + b + " is: " + andResult);

        int orResult = a | b;
        System.out.println("Bitwise OR (|) of " + a + " and " + b + " is: " + orResult);
        System.out.println("Binary format of OR result: " + Integer.toBinaryString(orResult));

        int xorResult = a ^ b;
        System.out.println("Bitwise XOR (^) of " + a + " and " + b + " is: " + xorResult);

        int notA = ~a;
        System.out.println("Bitwise NOT (~) of " + a + " is: " + notA);
        System.out.println("Binary format of ~" + a + " is: " + Integer.toBinaryString(notA));

        int leftShift = a << 2;
        System.out.println(a + " left shifted by 2 bits is: " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");

        int rightShift = a >> 2;
        System.out.println(a + " right shifted by 2 bits is: " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");
    }
}

