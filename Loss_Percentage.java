import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        double a = cs.nextDouble();
        double b = cs.nextDouble();
        double c = ((a-b)*100)/a;
        System.out.printf("%.2f",c);
    }
}