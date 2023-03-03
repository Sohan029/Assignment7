package Assign7;

import java.util.Scanner;
class Complex{
    int a,ai,b,bi;
    public String add() {
        int p1 = a + b;
        int p2 = ai + bi;
        if (p2 < 0) {
            p2 = (-1 * p2);
            return (p1 + "-" + p2 + 'i');
        } else return (p1 + "+" + p2 + 'i');
    }
    public String sub(){
        int p1=a-b;
        int p2=ai-bi;
        if(p2<0){
            p2=(-1*p2);
            return (p1+"-"+p2+'i');
        }
        else return (p1+"+"+p2+'i');
    }

    public String mul(){
        int p1=((a*b)-(ai*bi));
        int p2=((a*bi)+(ai*b));
        if(p2<0){
            p2=(-1*p2);
            return (p1+"-"+p2+'i');
        }
        else return (p1+"+"+p2+'i');
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex cp = new Complex();
        cp.a=sc.nextInt();
        cp.ai=sc.nextInt();
        cp.b=sc.nextInt();
        cp.bi=sc.nextInt();
        System.out.println(cp.add());
        System.out.println(cp.sub());
        System.out.println(cp.mul());
    }
}
