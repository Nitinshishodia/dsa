// PROGRAM TO SORT AN ARRAY USING BUBBLE SORT .
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class sortedArray01 {
    public static void descendingArray(int arr[]){
        int n=arr.length;
        for(int i=0; i>=n; i--){
            boolean swapped=false;
            for(int j=n-i-1;){
                if(arr[n-1]<arr[n-2]){
                    int temp=arr[n-1];
                    arr[n-1]=arr[n-2];
                    arr[n-2]=temp;
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};

        // function calling
         descendingArray(arr);
         System.out.println("Sorted array is:");
         System.out.println(Arrays.toString(arr));
    }
}
