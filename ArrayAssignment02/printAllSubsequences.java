import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class printAllSubsequences{
public static void printSubsequences(int arr[], int index , ArrayList<Integer> tempArr){
    // Base Case Condition 
    if(index == arr.length){
        // print all subsequences ---> but do not print empty entry 
        if(tempArr.size() > 0){
            System.out.println(tempArr);
        }
        return ;
    }

    // Recursive calls
    // Include 
    printSubsequences(arr, index+1, tempArr);
    // Add the value in tempArr
    tempArr.add(arr[index]);

    // DO NOT INCLUDE 
    printSubsequences(arr, index+1, tempArr);
    
    // REMOVE THE LAST VALUE 
    tempArr.remove(tempArr.size()-1);
}

public static void main(String[] args) {
 Scanner Sc= new Scanner(System.in);
 int arr1[]= {1,2};
 System.out.println(" For an array " + Arrays.toString(arr1));
 printSubsequences(arr1, 0, new ArrayList<>());
 
 System.out.println();

 int arr2[]={1,2,3};
 System.out.println(" For an array " + Arrays.toString(arr2));
 printSubsequences(arr2, 0, new ArrayList<>());
    }
}
