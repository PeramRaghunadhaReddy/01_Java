package task.conditional.loops;

import java.util.Scanner;

public class IfElsePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Maximum of two numbers");
        System.out.println("2. Maximum of three numbers");
        System.out.println("3. Divisible by 3");
        System.out.println("4. Divisible by 5");
        System.out.println("5. Divisible by 11");
        System.out.println("6. Even or Odd");
        System.out.println("7. Leap Year");
        System.out.println("8. Check Digit");
        System.out.println("9. Check Alphabet");
        System.out.println("10. Digit/Alphabet/Special Character");
        System.out.println("11. Positive or Negative");
        System.out.println("12. Celsius to Fahrenheit");
        System.out.println("13. Fahrenheit to Celsius");
        System.out.println("14. Vowel or Consonant");
        System.out.println("15. Uppercase or Lowercase");
        System.out.println("16. Week Day");
        System.out.println("17. Days in Month");
        System.out.println("18. Triangle Type");
        System.out.println("19. Voting Eligibility");
        System.out.println("20. Division based on Percentage");
        System.out.println("21. Grade Calculation");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            int a,b;
            System.out.print("Enter two numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b)
                System.out.println("Maximum = "+a);
            else
                System.out.println("Maximum = "+b);
        }

        else if(choice==2){
            int a,b,c;
            System.out.print("Enter three numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            if(a>b && a>c)
                System.out.println("Maximum = "+a);
            else if(b>c)
                System.out.println("Maximum = "+b);
            else
                System.out.println("Maximum = "+c);
        }

        else if(choice==3){
            int n;
            System.out.print("Enter number: ");
            n=sc.nextInt();
            if(n%3==0)
                System.out.println("Divisible by 3");
            else
                System.out.println("Not divisible by 3");
        }

        else if(choice==4){
            int n;
            System.out.print("Enter number: ");
            n=sc.nextInt();
            if(n%5==0)
                System.out.println("Divisible by 5");
            else
                System.out.println("Not divisible by 5");
        }

        else if(choice==5){
            int n;
            System.out.print("Enter number: ");
            n=sc.nextInt();
            if(n%11==0)
                System.out.println("Divisible by 11");
            else
                System.out.println("Not divisible by 11");
        }

        else if(choice==6){
            int n;
            System.out.print("Enter number: ");
            n=sc.nextInt();
            if(n%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }

        else if(choice==7){
            int year;
            System.out.print("Enter year: ");
            year=sc.nextInt();

            if((year%4==0 && year%100!=0) || year%400==0)
                System.out.println("Leap Year");
            else
                System.out.println("Not Leap Year");
        }

        else if(choice==8){
            char ch;
            System.out.print("Enter character: ");
            ch=sc.next().charAt(0);

            if(ch>='0' && ch<='9')
                System.out.println("Digit");
            else
                System.out.println("Not a Digit");
        }

        else if(choice==9){
            char ch;
            System.out.print("Enter character: ");
            ch=sc.next().charAt(0);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
                System.out.println("Alphabet");
            else
                System.out.println("Not Alphabet");
        }

        else if(choice==10){
            char ch;
            System.out.print("Enter character: ");
            ch=sc.next().charAt(0);

            if(ch>='0' && ch<='9')
                System.out.println("Digit");
            else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
                System.out.println("Alphabet");
            else
                System.out.println("Special Character");
        }

        else if(choice==11){
            int n;
            System.out.print("Enter number: ");
            n=sc.nextInt();

            if(n>=0)
                System.out.println("Positive");
            else
                System.out.println("Negative");
        }

        else if(choice==12){
            double c,f;
            System.out.print("Enter Celsius: ");
            c=sc.nextDouble();
            f=(c*9/5)+32;
            System.out.println("Fahrenheit = "+f);
        }

        else if(choice==13){
            double f,c;
            System.out.print("Enter Fahrenheit: ");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("Celsius = "+c);
        }

        else if(choice==14){
            char ch;
            System.out.print("Enter character: ");
            ch=sc.next().charAt(0);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
            ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }

        else if(choice==15){
            char ch;
            System.out.print("Enter character: ");
            ch=sc.next().charAt(0);

            if(ch>='A' && ch<='Z')
                System.out.println("Uppercase");
            else if(ch>='a' && ch<='z')
                System.out.println("Lowercase");
        }

        else if(choice==16){
            int day;
            System.out.print("Enter week number (1-7): ");
            day=sc.nextInt();

            if(day==1) System.out.println("Sunday");
            else if(day==2) System.out.println("Monday");
            else if(day==3) System.out.println("Tuesday");
            else if(day==4) System.out.println("Wednesday");
            else if(day==5) System.out.println("Thursday");
            else if(day==6) System.out.println("Friday");
            else if(day==7) System.out.println("Saturday");
            else System.out.println("Invalid");
        }

        else if(choice==17){
            int m;
            System.out.print("Enter month number: ");
            m=sc.nextInt();

            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
                System.out.println("31 days");
            else if(m==4||m==6||m==9||m==11)
                System.out.println("30 days");
            else if(m==2)
                System.out.println("28 or 29 days");
            else
                System.out.println("Invalid month");
        }

        else if(choice==18){
            int a,b,c;
            System.out.print("Enter three sides: ");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            if(a==b && b==c)
                System.out.println("Equilateral Triangle");
            else if(a==b || b==c || a==c)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");
        }

        else if(choice==19){
            int age;
            System.out.print("Enter age: ");
            age=sc.nextInt();

            if(age>=18)
                System.out.println("Eligible to Vote");
            else
                System.out.println("Not Eligible");
        }

        else if(choice==20){
            double p;
            System.out.print("Enter Percentage: ");
            p=sc.nextDouble();

            if(p>=60)
                System.out.println("Division 1");
            else if(p>=45)
                System.out.println("Division 2");
            else if(p>=30)
                System.out.println("Division 3");
            else
                System.out.println("Fail");
        }

        else if(choice==21){
            int m,p,c,e,h,total;
            double per;

            System.out.print("Enter marks of 5 subjects: ");
            m=sc.nextInt();
            p=sc.nextInt();
            c=sc.nextInt();
            e=sc.nextInt();
            h=sc.nextInt();

            total=m+p+c+e+h;
            per=total/5.0;

            System.out.println("Percentage = "+per);

            if(per>=90)
                System.out.println("Grade A");
            else if(per>=80)
                System.out.println("Grade B");
            else if(per>=70)
                System.out.println("Grade C");
            else if(per>=60)
                System.out.println("Grade D");
            else if(per>=40)
                System.out.println("Grade E");
            else
                System.out.println("Grade F");
        }

        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}