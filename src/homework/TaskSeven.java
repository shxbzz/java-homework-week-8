package homework;
import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        double commission;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sales ID:");
        int salesId = s.nextInt();
        System.out.print("Enter seller's name:");
        String sellerName = s.next();
        System.out.print("Enter sales amount: ");
        double salesAmount = s.nextDouble();
        System.out.print("Enter basic salary: ");
        int basicSalary = s.nextInt();
        if (salesAmount >= 50000) {
            commission = salesAmount * 35 / 100;
            System.out.println("Commission is 35% on more than 50000 sales amount: " + commission);
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 20 / 100;
            System.out.println("Commission is 20% on more than 30000 sales amount: " + commission);
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 10 / 100;
            System.out.println("Commission is 10% on more than 20000 sales amount: " + commission);
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 5 / 100;
            System.out.println("Commission is 5 % on more than 10000 sales amount: " + commission);
        } else {
            commission = salesAmount * 2 / 100;
            System.out.println("Commission is 2% on less than 10000 sales amount: " + commission);
        }
    }
}
