package task.conditional.loops;

import java.util.Scanner;

public class correctPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passWord = 12345;
        int attempts = 0;
        int PW;
        do {
            System.out.println("Enter Password: ");
            PW = sc.nextInt();
            if (passWord == PW) {
                System.out.println("Password is Correct");
                break;
            } else {
                System.out.println("Password is Wrong");
                System.out.println("Failed to Log IN");
            }
            attempts++;
        }
        while (attempts <= 2);
        if (passWord == PW) {
            System.out.println("Password is Correct");
        }
    }
}
