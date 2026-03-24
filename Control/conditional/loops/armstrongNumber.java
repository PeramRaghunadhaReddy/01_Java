package task.conditional.loops;

public class armstrongNumber {
    public static void main(String[] args) {

        long d = 153;
        long armNum = 0;
        long num =d;
        int Count = String.valueOf(d).length();
        while (d > 0) {
            long digit = d % 10;
            double a = Math.pow(digit, Count);
            armNum += a;
            d /= 10;
        }
        System.out.println(armNum);
        if (num == armNum){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not armstrong number");
        }
    }
}
