package task.conditional.loops;

import java.util.Scanner;

public class EMIReport {
    public static void main(String[] args) {
        int totalEmi = 55555;
        int monthlyEmi = 5555;
        int paidEmi = 0;
        int months;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many months history you want ");
        months = sc.nextInt();
        for (int i = 1; i <= months; i++){
            if(i <= months){
                paidEmi += 5555;
                totalEmi -= monthlyEmi;
                System.out.println("Paid Emi upto "+i+" months is "+paidEmi);
                System.out.println("remaining Emi is "+totalEmi);
            }
        }

    }
}
