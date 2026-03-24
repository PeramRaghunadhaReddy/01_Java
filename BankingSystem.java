package task.conditional.loops;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Transfer");
        System.out.println("4.Invalid");
        System.out.println("enter your transaction type ");
        a = sc.nextInt();
        int amount = 1000;
        double fee = 0;
        switch (a){
            case 1:
                fee = amount *0;
                System.out.println("Transaction fee for deposit is " +fee);
                break;
            case 2:
                fee = amount *0.02;
                System.out.println("Transaction fee for deposit is " +fee);
                break;
            case 3:
                fee = amount *0.015;
                System.out.println("Transaction fee for deposit is " +fee);
                break;
            case 4:
                System.out.println("Transaction fee for Invalid ");
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}
