import java.util.Scanner;
import java.io.*;

public class LinearSearch {
    public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    // size of the element from the user 
    System.out.println("Enter the number of element present in an array ");
    int n=Sc.nextInt();
    // Array element entered from user 
    System.out.println("Enter the array element ");
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
    arr[i]=Sc.nextInt();    
    }
  // Target elements from the users 
  System.out.println("Enter the target element ");
  int x=Sc.nextInt();

  // Implementation of linear search
  int idx=-1;
  for(int i=0; i<n; i++){
   if(arr[i]==x){
    idx=i;
    break;
   } 
  }
  if(idx==-1){
    System.out.println("Searching elements is not found in an array ");
  }
  else{
    System.out.println("searched element is found in the location : " + idx);
  }
    }
}

        

