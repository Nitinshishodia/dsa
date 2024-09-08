import java.util.Scanner;
import java.io.*;

public class MaxArrayRecr {
 public static void main(String[] args) {
    int max=0;
    int arr[]={13,1,-3,22,5};
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
            
           // max++;
        }
        System.out.println("max element is:"+max);
    }
 }  
}
