//This is my third task.

import java.util.Scanner;
public class technohackscalci {
    static void addition(int a,int b){
        int c=a+b;
        System.out.println("Addition : "+c);

    }
    static void subtraction(int a,int b){
        int c=a-b;
        System.out.println("Subtraction : "+c);
    }
    static void division(int a,int b){
        int c=a/b;
        System.out.println("Division : "+c);
    }
    static void multiplication(int a,int b){
        int c=a*b;
        System.out.println("Multiplication :"+c);
    }
    static void power(double a,double b){
        double c=Math.pow(a,b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome user !");

        while (true) {
            System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Power \n 6.Exit");
            System.out.println("Choose option --");
            int choose=sc.nextInt();
            switch (choose){
                case 1:System.out.println("enter a :");
                    int a=sc.nextInt();
                    System.out.println("enter b :");
                    int b=sc.nextInt();
                    addition(a,b);
                    break;
                case 2:
                    System.out.println("enter a :");
                    int c=sc.nextInt();
                    System.out.println("enter b :");
                    int d=sc.nextInt();
                    subtraction(c,d);
                    break;
                case 3:System.out.println("enter a :");
                    int e=sc.nextInt();
                    System.out.println("enter b :");
                    int f=sc.nextInt();
                    multiplication(e,f);
                    break;
                case 4: System.out.println("enter a :");
                    int g=sc.nextInt();
                    System.out.println("enter b :");
                    int h=sc.nextInt();
                    division(g,h);
                    break;
                case 5:System.out.println("enter a :");
                    double p=sc.nextInt();
                    System.out.println("enter b :");
                    double q=sc.nextInt();
                    power(p,q);
                case 6:
                    System.out.println("Thank you !");
                    System.exit(0);
            }
        }
    }
}
