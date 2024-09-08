import java.util.Scanner;
import java.io.*;

public class palindromebroot {
    public static void palindroneArray(int arr[]){
        int left=0;
        int right=arrr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    // System.out.println("ENter the  size of array :");
    // int n=Sc.nextInt();
    // int arr[]=new int[n];
    // System.out.println("enter the array element");
    // for(int i=0; i<n; i++){
    // arr[i]=Sc.nextInt();
    int arr[]={1,2,3,2,1};
    }
      

    // function call
    palindroneArray(arr);
    if(ispalindromic(array)){
        System.out.println("The array is palindromic:");
    }
    else{
        System.out.println("The array is not palindromic array ");
    }
    }
