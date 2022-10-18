package homework;

import java.util.Scanner;

public class TaskFive {
    String empID;
    String empName;
    int bs,hra,ta,da,pf,gs;

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee ID");
        empID = scan.next();
        System.out.println("Enter employee name");
        empName = scan.next();
        System.out.println("Enter basic salary for employee");
        bs = Integer.parseInt(scan.next());
        calculate();
    }
    public void calculate(){
        hra=((110/100)*bs);
        da=((8/100)*bs);
        ta=((9/100)*bs);
        pf=((20/100)*bs);
        gs=(bs+hra+ta+da-pf);
    }
    public void display(){
        System.out.println("+----------------------------+");
        System.out.println("|Employee ID   : "+empID+"   |");
        System.out.println("|Employee Name : "+empName+" |");
        System.out.println("|----------------------------|");
        System.out.println("|Basic Salary  : "+bs+"      |");
        System.out.println("|HRA           : "+hra+"     |");
        System.out.println("|TA            : "+ta+"      |");
        System.out.println("|DA            : "+da+"      |");
        System.out.println("|PF            : "+pf+"      |");
        System.out.println("|----------------------------|");
        System.out.println("|Gross Salary  : "+gs+"      |");
        System.out.println("+----------------------------+");

    }

    public static void main(String[] args) {
        TaskFive eobj=new TaskFive();
        eobj.read();
        eobj.calculate();
        eobj.display();
    }

}
