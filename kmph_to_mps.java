import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = (a*1000)/3600;
        System.out.printf("%.2f",b);
    }
}