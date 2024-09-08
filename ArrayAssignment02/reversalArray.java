import java.util.Scanner;
import java.io.*;

public class reversalArray {
public static void main(String[] args){
    
    int array[]={2,3,4,5,6};
    int n=array.length;
    for(int i=0; i<n/2; i++){
        // swap the array element 
        int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
    }
    System.out.println("The reversal array is ");
    for(int i=0; i<n; i++){
        System.out.println(array[i]+ " ");
    }
    System.out.println();
        
    }
}
