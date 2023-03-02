package Assign7;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Triangle obj1 = new Triangle();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Area"+obj1.area());
        obj1.s1=sc.nextInt();
        obj1.s2=sc.nextInt();
        obj1.s3=sc.nextInt();
        System.out.println("Area"+obj1.area());
        System.out.println("Perimeter"+obj1.perimeter());
    }
}
class Triangle{
    int s1,s2,s3;
    public Double area(){
        double s=(s1+s2+s3)/2.0;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    public Double perimeter(){
        return (s1+s2+s3)/2.0;
    }
}
