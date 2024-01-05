import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int u = sc.nextInt();
        long k = s*t*u*2*512;// because it has 2 surfaces
        System.out.println(k);
    }
}