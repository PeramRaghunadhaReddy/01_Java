package task.conditional.loops;

public class countNumber {
    public static void main(String[] args) {
        int No = 55555;
        int Count = 0;
        while(No != 0) {
            No /= 10;
            Count++;
        }
        System.out.println("Number of the digits in the Given Number is: "+Count);

    }
}
