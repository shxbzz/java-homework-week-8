package homework;

public class TaskNineteen {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;
        System.out.println("Average : " + average);
    }
}