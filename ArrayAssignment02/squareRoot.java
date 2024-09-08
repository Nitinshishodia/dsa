// time complexity :o(n)
// space complexity :o(1)

import java.util.Scanner;
import java.io.*;
public class squareRoot {
    public static int squareRootArray(int num){
        int low=0; int high=num; int result=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        long val=mid*mid;
        if(val==num){
            // perfect square number
            return mid;
        }
        else if(val<mid){
            result=mid;// store the floor value , increases the number is not the prfect square root we can print the floor

            low=mid+1;
        }
        else{
            high=mid-1;
        }   
      }
      return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number you want to be square root :");
        int num=Sc.nextInt();

        // function calling
        int result=squareRootArray(num);
        System.out.println("square root of given number is :"+ result);
    }
}
