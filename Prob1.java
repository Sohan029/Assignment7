package Assign7;

class Student{
    String name;
    int roll_no;
}
public class Prob1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.roll_no=2;
        obj1.name="John";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.name);
    }
}
