import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*5;
        if(c < b) System.out.println("NO");
        else System.out.println("YES");
    }
}