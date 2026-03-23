package task.conditional.loops;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = 5;
        int attempts = 0;
        int GuessNumber;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter the your guessing Number ");
            GuessNumber = sc.nextInt();
            attempts++;
            if (secretNumber>GuessNumber){
                System.out.println("your guess number is Lower");
            }
            else if (secretNumber<GuessNumber) {
                System.out.println("your guess number is Higher");
            }
            else if (secretNumber == GuessNumber){
                System.out.println("Wow! your guessing is exactly correct");
                break;
            }
        }
        sc.close();
    }
}
