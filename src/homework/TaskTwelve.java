package homework;

import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A NUMBER.");

        } else {

            System.out.println(ch + " is A SYMBOL.");
        }
    }
}
