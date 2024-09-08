// Time Complexity : o(n)
// Space complexity :o(1)

import java.util.*;
import java.io.*;
public class Linear {
public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
// Size of element from the user 
System.out.println("Enter the number of element present in an array :");
int n=Sc.nextInt();
// Array element entered from user 
System.out.println("Enter the array element :");
int arr[]=new int[n];// Array Initialization of array (Creation)
for(int i=0; i<n; i++)
{
    arr[i]=Sc.nextInt();
}
// Target element fron the user 
System.out.println("Enter the target element :");
int x=Sc.nextInt();

// Implementation of Linear search 
int idx=-1;
for(int i=0; i<n; i++){
    if(arr[i]==x){
        idx=i;
        break;
    }
}
if(idx==-1){
    System.out.println("Searched Element is not present in an array :");
}
else{
    System.out.println("Searched element is found at location:"+idx);
}
    }
}