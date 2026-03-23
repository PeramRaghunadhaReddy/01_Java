package task.conditional.loops;

import java.util.Scanner;

public class AllForLoopPrograms {

    static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }

    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("=========== MENU ===========");
        System.out.println("1. Natural numbers 1 to n");
        System.out.println("2. Even numbers 1 to 100");
        System.out.println("3. Odd numbers 1 to 100");
        System.out.println("4. Sum of even numbers 1 to n");
        System.out.println("5. Sum of odd numbers 1 to n");
        System.out.println("6. Multiplication table");
        System.out.println("7. Count digits");
        System.out.println("8. Sum of digits");
        System.out.println("9. Natural numbers reverse");
        System.out.println("10. Prime number check");
        System.out.println("11. Prime numbers 1 to n");
        System.out.println("12. Sum of prime numbers");
        System.out.println("13. Armstrong check");
        System.out.println("14. Armstrong numbers 1 to n");
        System.out.println("15. Perfect number check");
        System.out.println("16. Perfect numbers 1 to n");
        System.out.println("17. Strong number check");
        System.out.println("18. Strong numbers 1 to n");
        System.out.println("19. Swap first and last digit");
        System.out.println("20. Swap using third variable");
        System.out.println("21. Swap without third variable");
        System.out.println("22. Power without pow()");
        System.out.println("23. Power without pow()");
        System.out.println("24. Power using pow()");
        System.out.println("25. Palindrome number");
        System.out.println("26. Fibonacci series");
        System.out.println("27. Fibonacci using recursion");
        System.out.println("28. Digit frequency");
        System.out.println("29. ASCII values");
        System.out.println("30. Alphabets a-z");
        System.out.println("31. Uppercase alphabets");
        System.out.println("32. Lowercase alphabets");
        System.out.println("33. Factors of number");
        System.out.println("34. HCF (GCD)");
        System.out.println("35. LCM");
        System.out.println("36. Prime factors");
        System.out.println("============================");

        System.out.print("Enter choice: ");
        int ch=sc.nextInt();

        switch(ch){

            case 1:
                System.out.print("Enter n: ");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++)
                    System.out.print(i+" ");
                break;

            case 2:
                for(int i=2;i<=100;i+=2)
                    System.out.print(i+" ");
                break;

            case 3:
                for(int i=1;i<=100;i+=2)
                    System.out.print(i+" ");
                break;

            case 4:
                System.out.print("Enter n: ");
                int n1=sc.nextInt();
                int sumEven=0;
                for(int i=2;i<=n1;i+=2)
                    sumEven+=i;
                System.out.println("Sum="+sumEven);
                break;

            case 5:
                System.out.print("Enter n: ");
                int n2=sc.nextInt();
                int sumOdd=0;
                for(int i=1;i<=n2;i+=2)
                    sumOdd+=i;
                System.out.println("Sum="+sumOdd);
                break;

            case 6:
                System.out.print("Enter number: ");
                int num=sc.nextInt();
                for(int i=1;i<=10;i++)
                    System.out.println(num+" x "+i+" = "+(num*i));
                break;

            case 7:
                System.out.print("Enter number: ");
                int d=sc.nextInt();
                int count=0;
                for(;d!=0;d/=10)
                    count++;
                System.out.println("Digits="+count);
                break;

            case 8:
                System.out.print("Enter number: ");
                int s=sc.nextInt();
                int sum=0;
                for(;s!=0;s/=10)
                    sum+=s%10;
                System.out.println("Sum="+sum);
                break;

            case 9:
                System.out.print("Enter n: ");
                int r=sc.nextInt();
                for(int i=r;i>=1;i--)
                    System.out.print(i+" ");
                break;

            case 10:
                System.out.print("Enter number: ");
                int p=sc.nextInt();
                int flag=0;
                for(int i=2;i<=p/2;i++)
                    if(p%i==0) flag=1;

                if(flag==0 && p>1)
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
                break;

            case 11:
                System.out.print("Enter n: ");
                int pn=sc.nextInt();
                for(int i=2;i<=pn;i++){
                    int f=0;
                    for(int j=2;j<=i/2;j++)
                        if(i%j==0) f=1;
                    if(f==0)
                        System.out.print(i+" ");
                }
                break;

            case 12:
                System.out.print("Enter n: ");
                int sp=sc.nextInt();
                int primeSum=0;

                for(int i=2;i<=sp;i++){
                    int f=0;
                    for(int j=2;j<=i/2;j++)
                        if(i%j==0) f=1;
                    if(f==0)
                        primeSum+=i;
                }
                System.out.println("Sum="+primeSum);
                break;

            case 13:
                System.out.print("Enter number: ");
                int arm=sc.nextInt();
                int temp=arm,digits=0,res=0;

                for(temp=arm;temp!=0;temp/=10)
                    digits++;

                for(temp=arm;temp!=0;temp/=10){
                    int digit=temp%10;
                    int pow=1;
                    for(int i=1;i<=digits;i++)
                        pow*=digit;
                    res+=pow;
                }

                if(res==arm)
                    System.out.println("Armstrong");
                else
                    System.out.println("Not Armstrong");
                break;

            case 15:
                System.out.print("Enter number: ");
                int per=sc.nextInt();
                int sm=0;
                for(int i=1;i<=per/2;i++)
                    if(per%i==0)
                        sm+=i;

                if(sm==per)
                    System.out.println("Perfect");
                else
                    System.out.println("Not Perfect");
                break;

            case 17:
                System.out.print("Enter number: ");
                int st=sc.nextInt();
                int t=st,strongSum=0;

                for(;t!=0;t/=10){
                    int dig=t%10;
                    strongSum+=factorial(dig);
                }

                if(strongSum==st)
                    System.out.println("Strong");
                else
                    System.out.println("Not Strong");
                break;

            case 20:
                int a=5,b=10,temp1;
                temp1=a;
                a=b;
                b=temp1;
                System.out.println("a="+a+" b="+b);
                break;

            case 21:
                int x=5,y=10;
                x=x+y;
                y=x-y;
                x=x-y;
                System.out.println("x="+x+" y="+y);
                break;

            case 22:
                System.out.print("Enter base: ");
                int base=sc.nextInt();
                System.out.print("Enter power: ");
                int power=sc.nextInt();
                int result=1;

                for(int i=1;i<=power;i++)
                    result*=base;

                System.out.println("Result="+result);
                break;

            case 24:
                System.out.print("Enter base: ");
                int b1=sc.nextInt();
                System.out.print("Enter power: ");
                int p1=sc.nextInt();
                System.out.println(Math.pow(b1,p1));
                break;

            case 25:
                System.out.print("Enter number: ");
                int pal=sc.nextInt();
                int rev=0,tp=pal;

                for(;tp!=0;tp/=10)
                    rev=rev*10+tp%10;

                if(rev==pal)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 26:
                System.out.print("Enter n: ");
                int fib=sc.nextInt();
                int f1=0,f2=1;

                for(int i=1;i<=fib;i++){
                    System.out.print(f1+" ");
                    int f3=f1+f2;
                    f1=f2;
                    f2=f3;
                }
                break;

            case 27:
                System.out.print("Enter n: ");
                int fr=sc.nextInt();
                for(int i=0;i<fr;i++)
                    System.out.print(fibonacci(i)+" ");
                break;

            case 28:
                System.out.print("Enter number: ");
                long num28=sc.nextLong();

                for(int i=0;i<=9;i++){
                    int freq=0;
                    long temp28=num28;
                    for(;temp28!=0;temp28/=10)
                        if(temp28%10==i)
                            freq++;

                    if(freq>0)
                        System.out.println(i+" occurs "+freq+" times");
                }
                break;

            case 29:
                for(int i=0;i<=127;i++)
                    System.out.println(i+" = "+(char)i);
                break;

            case 30:
                for(char c='a';c<='z';c++)
                    System.out.print(c+" ");
                break;

            case 31:
                for(char c='A';c<='Z';c++)
                    System.out.print(c+" ");
                break;

            case 32:
                for(char c='a';c<='z';c++)
                    System.out.print(c+" ");
                break;

            case 33:
                System.out.print("Enter number: ");
                int f=sc.nextInt();
                for(int i=1;i<=f;i++)
                    if(f%i==0)
                        System.out.print(i+" ");
                break;

            case 34:
                System.out.print("Enter two numbers: ");
                int h1=sc.nextInt();
                int h2=sc.nextInt();
                int gcd=1;

                for(int i=1;i<=h1 && i<=h2;i++)
                    if(h1%i==0 && h2%i==0)
                        gcd=i;

                System.out.println("HCF="+gcd);
                break;

            case 35:
                System.out.print("Enter two numbers: ");
                int l1=sc.nextInt();
                int l2=sc.nextInt();

                int lcm=(l1>l2)?l1:l2;

                for(;;lcm++)
                    if(lcm%l1==0 && lcm%l2==0){
                        System.out.println("LCM="+lcm);
                        break;
                    }
                break;

            case 36:
                System.out.print("Enter number: ");
                int pf=sc.nextInt();

                for(int i=2;i<=pf;i++)
                    while(pf%i==0){
                        System.out.print(i+" ");
                        pf/=i;
                    }
                break;

            default:
                System.out.println("Invalid choice");

        }

        sc.close();
    }
}