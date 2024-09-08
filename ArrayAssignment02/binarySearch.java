import java.util.Scanner;
import java.io.*;

public class binarySearch {
    public static int binarySearch(int arr[], int x){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        // Size Of Array Enter By the user 
        System.out.println("Enter the number of element present in an array  :");
        int n=Sc.nextInt();
        // Array element entered by the user 
        System.out.println("Enter the Array Element :");
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=Sc.nextInt();
        }
        // Target element entered by the users 
        System.out.println("Enter the target element :");
        int x=Sc.nextInt();
       
        // function calling to binary search 
        int result=binarySearch(arr,x);
        if(result==-1){
            System.out.println("Searched element is not found in an array ");
        }
        else{
            System.out.println("Searched element is found at thr location : "+ result);
        }


        
    }
}
