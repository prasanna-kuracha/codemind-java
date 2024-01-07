import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        double a = cs.nextDouble();
        double b = cs.nextDouble();
        double c = cs.nextDouble();
        double s = (a+b+c)*0.5;
        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}