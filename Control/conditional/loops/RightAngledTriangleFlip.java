package task.conditional.loops;

public class RightAngledTriangleFlip {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        int num = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
        char ch = 'A';
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println(" ");
        }
        System.out.println("Horizontally Flipped Right-Angled Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        int num1 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+num1);
                num1++;
            }
            System.out.println(" ");
        }
        char ch1 = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+ch1);
                ch1++;
            }
            System.out.println(" ");
        }
    }
}
