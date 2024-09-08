import java.util.*;
import java.util.Scanner;

public class largestArray {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; // INFINITY
        for(int i =0; i <numbers.length;i++){
            if(Largest<numbers[i]){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
        int numbers[] = { 1,2,6,3,5};
        // function calling

        System.out.println("Largest Number Is  " + getLargest(numbers));


    }
}
