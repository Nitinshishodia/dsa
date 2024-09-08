import java.util.*;
import java.io.*;
public class bubbleSort {
    public static void bubbleSortArray(int arr[]){
        for(int i=0; i<arr.length; i++){
         boolean swapped=false;
         // for every Iteration we get a biggest element in an array 
         for(int j=0; j<arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                // swap between arr[j] and arr[j+1]
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
         }   
         if(!swapped){
            break;
         }
        }
    }
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int arr[]={20,50,10,12,45,67,90};
        // function calling
        bubbleSortArray(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));

    }
}
