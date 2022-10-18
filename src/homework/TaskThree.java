package homework;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No. : ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Maths Marks : ");
        float mat = sc.nextFloat();
        System.out.print("Enter English Marks : ");
        float eng = sc.nextFloat();
        System.out.print("Enter Science Marks : ");
        float sci = sc.nextFloat();

        //Total and Percentage
        float total = mat + eng + sci;
        float per = total / 3f;

        //Details
        System.out.println();
        System.out.println("Name        : " + name);
        System.out.println("Roll No.    : " + rollNo);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + per);

        //Results

        if(per>=35f) {
            String r = "Pass";
            System.out.println("Result      : " + r);
        }else if (per<35f){
            String r = "Fail";
            System.out.println("Result      : " + r);
            }

        //Grades
        if (per >= 80f) {
            String g = "A+";
            System.out.println("Grade       : " + g);
        } else if (per >= 60f) {
            String g = "A";
            System.out.println("Grade       : " + g);
        } else if (per >= 50f) {
            String g = "B";
            System.out.println("Grade       : " + g);
        } else if (per >= 35f) {
            String g = "C";
            System.out.println("Grade       : " + g);
        }
    }
}
