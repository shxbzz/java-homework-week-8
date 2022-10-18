package homework;

import java.util.Scanner;

public class TaskFourPartTwo {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number_of_month, year;
        int days = 0;
        String month = "does not exist";

        System.out.println("What is the number of the month ?");
        number_of_month = console.nextInt();

        System.out.println("Enter the year");
        year = console.nextInt();

        switch (number_of_month) {
            case 1:
                month = "January";
                days = 31;
                break;

            case 2:
                month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                month = "March";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "October";
                days = 31;
                break;
            case 11:
                month = "November";
                days = 30;
                break;
            case 12:
                month = "December";
                days = 31;
                break;
            default :
                System.out.println(month);
        }
        System.out.println("Month: "+ month);
        System.out.println("Year : " + year);
        System.out.println("Days : " + days);
    }
}
