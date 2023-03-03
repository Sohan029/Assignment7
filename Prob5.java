package Assign7;

import java.util.Scanner;

class Employee {
    String name, join, add;
}
public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        emp1.name="Robert";
        emp1.join="1994";
        emp1.add="64C- WallsStreet";
        Employee emp2 = new Employee();
        emp2.name="Sam";
        emp2.join="2000";
        emp2.add="68D- WallsStreet";
        Employee emp3 = new Employee();
        emp3.name="John";
        emp3.join="1999";
        emp3.add="26B- WallsStreet";

        System.out.println("Name   "+" Year Of Joininig    "+"Address");
        System.out.println(emp1.name+"      "+emp1.join+"           "+emp1.add);
        System.out.println(emp2.name+"         "+emp2.join+"           "+emp2.add);
        System.out.println(emp3.name+"        "+emp3.join+"           "+emp3.add);


    }

}
