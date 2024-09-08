import java.util.Scanner;
import java.io.*;
   
public class lowerBound {
    public static int lowerBoundArray(int arr[], int target){
        int low=0, high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                // traverse the left side of array
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return result;
    }
public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
// Enter the size of array 
System.out.println("Enter the number of element present in an array :");
int n=Sc.nextInt();
// Enter the Array element
System.out.println("Enter the array element :");
int arr[]=new int[n];
for(int i=0; i<n; i++){
    arr[i]=Sc.nextInt();
}

// ENTER THE TARGET ELEMENT
System.out.println("Enter the target element:");
int target=Sc.nextInt();

// function calling
int result=lowerBoundArray(arr,target);
if(result==-1){
    System.out.println("Target element is not found in an array :");
}
else{
    System.out.println("Target element is found at the location :"+result);
}
    }
}