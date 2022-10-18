package homework;
import java.util.Scanner;
public class TaskNine {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the character:");
        char a=s.next().charAt(0);
        switch (a)
        {
            case ('A'):
                System.out.println("Amsterdam");
                break;
            case ('B'):
                System.out.println("Bombay");
                break;
            case ('C'):
                System.out.println("Cannes");
                break;
            case ('D'):
                System.out.println("Dublin");
                break;
            case ('E'):
                System.out.println("Edinburg");
                break;
            case ('F'):
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        s.close();
    }

}
