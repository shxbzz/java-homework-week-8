package homework;
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input any character from A to F:");
        char alphabet = s.next().charAt(0);
        if (alphabet=='A')
        {
            System.out.println("Amsterdam");
        } else if (alphabet=='B')
        {
            System.out.println("Bombay");
        }else if (alphabet=='C')
        {
            System.out.println("Cannes");
        }else if (alphabet=='D')
        {
            System.out.println("Dublin");
        }else if (alphabet=='E')
        {
            System.out.println("Edinburgh");
        }else if (alphabet=='F')
        {
            System.out.println("Florence");
        }else
        {
            System.out.println("Invalid Entry");
        }
        s.close();
    }
}
