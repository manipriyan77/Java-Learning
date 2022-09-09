package Assignment;
import java.lang.*;
import java.util.*;

// You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook.
// According to your cookbook, the Lasagna should be in the oven for 40 minutes:
// Given the actual minutes the lasagna has been in the oven, find how many minutes the lasagna still needs to bake.
public class Lasanga {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int min = value.nextInt();
        System.out.print(40-min);    
    }
    
}
