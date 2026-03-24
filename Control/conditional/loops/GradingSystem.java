package task.conditional.loops;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student marks");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Student get 'A' grade");
        }
        else if(marks >= 75 && marks < 90) {
            System.out.println("Student get 'B' grade");
        }
        else if(marks >= 50 && marks < 75) {
            System.out.println("Student get 'C' grade");
        }
        else if(marks < 50) {
            System.out.println("Student get 'F' grade");
        }
    }
}
