import java.util.Scanner;
import java.io.*;

public class tillingProbleam {
    public static int getWays(int n){
        // base case conditions 
        if(n<= 3){
            return n;
        }
        // recursive calls
        return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println(" for n = 1 , total ways = " + getWays(1)); 
    System.out.println(" for n = 2 , total ways = " + getWays(2));
    System.out.println(" for n = 3 , total ways = " + getWays(3));
    System.out.println(" for n = 4 , total ways = " + getWays(4));
    System.out.println(" for n = 5 , total ways = " + getWays(5));
    }
}
