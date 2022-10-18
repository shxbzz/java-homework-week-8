package homework;
import java.util.Scanner;
public class TaskTen{
    public static void main(String[] args)
    {
        int a, b, opt, add, sub, mul;
        double div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = sc.nextInt();
        System.out.print("Enter second number:");
        b = sc.nextInt();
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            opt = sc.nextInt();
            switch(opt)
            {
                case 1:
                    add = a + b;
                    System.out.println("Result:"+add);
                    break;

                case 2:
                    sub = a - b;
                    System.out.println("Result:"+sub);
                    break;

                case 3:
                    mul = a * b;
                    System.out.println("Result:"+mul);
                    break;

                case 4:
                    div = (double)a / b;
                    System.out.println("Result:"+div);
                    break;

            }
        }
    }
}

