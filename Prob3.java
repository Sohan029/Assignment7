package Assign7;

import java.util.Scanner;

class Area{
    double length,breadth;
    public double returnArea(){
        return length*breadth;
    }
}
public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        obj.length=sc.nextInt();
        obj.breadth=sc.nextInt();
        System.out.println(obj.returnArea());
    }
}
