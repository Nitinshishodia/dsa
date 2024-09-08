import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class printAllSequences(int arr[],int index, ArrayList<Integer>tempArr)
{
    // base case condition
    if(index==arr.length){
        // print all subsequences -- but do not print empty entries 
        if(tempArr.size()>0){
            System.out.println(tempArr);
        }
        return;
    }
    //  Recursive calls
    // INCLUDE 
    printAllSequences(arr,index+1; tempArr);
    // Add the value in  tempArr
    tempArr.add(arr[index]);

    // DO NOT INCLUDE 
    printAllSequences(arr,index+1, tempArr);
    tempArr.remove(tempArr.size()-1);
}
    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println("for an array :"+Arrays.toString(arr));
        printAllSequences(arr1,0,new newArray list<>());
        System.out.println();
    }
