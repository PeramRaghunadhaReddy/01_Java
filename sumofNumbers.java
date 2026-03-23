package task.conditional.loops;

public class sumofNumbers {
    public static void main(String[] args) {
        long d = 12345;
        long sum = 0;
        while (d != 0) {
            long r = d % 10;
            sum=sum + r;
            d /= 10;
        }
        System.out.println(sum);
    }
}
