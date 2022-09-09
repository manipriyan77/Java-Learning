package HomeWork;
import java.util.*;
import java.lang.*;
//Given an integer in the input print its last digit.


public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();         
        int lastDigit = num%10;
        System.out.println(lastDigit);
    }
}
