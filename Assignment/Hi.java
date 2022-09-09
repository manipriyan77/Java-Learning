package Assignment;
import java.lang.*;
import java.util.*;

//Given two names A and B as input. Print "A says Hi to B". where A and B are the names in input.
public class Hi{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    System.out.println(a + "says Hi to "+b);    
}}