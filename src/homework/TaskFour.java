package homework;

public class TaskFour {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static void isLeapYear(int year) {
        boolean isLeap = false;
        if(year >= 1 && year <= 9999 && year % 4 == 0){
            if( year % 100 == 0){
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }else
                isLeap = true;
        }else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}