import java.util.*;
import java.io.*;
public class insertion {
    public static void insertionSortArray(int arr[]){
        // Implementation of insertion sort 
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                // swap the element between arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
int arr[]={20,50,25,67,79,12,15};
// function calling
insertionSortArray(arr);
System.out.println("Sorted array is :");
System.out.println(Arrays.toString(arr));
    }
}
