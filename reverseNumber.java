package task.conditional.loops;

public class reverseNumber {
    public static void main(String[] args) {
        long d = 12345;
        long reverse = 0;
        while (d != 0) {
            long r = d % 10;
            reverse=reverse*10 + r;
            d /= 10;
        }
        System.out.println(reverse);
    }

}
