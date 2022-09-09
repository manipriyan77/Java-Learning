package Assignment;
import java.lang.*;
import java.util.*;
public class Operators {
    //Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println((a+b) + "," +( a*b) + "," +( a-b)+","+(a/b));
    }
}
