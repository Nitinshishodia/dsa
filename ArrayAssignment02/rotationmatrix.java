import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class rotationmatrix {
public static void rotatedmatrix(int arr[][]){
    // STEP 1: TRANSPOSE OF 2D ARRAY 
    int m=arr.length;
    int n=arr[0].length;
    for(int i=0; i<m; i++){
    for(int j=i; j<n; j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }    
    }
    // STEP 2:
    for(int i=0; i<m; i++){
        int li=0;
        int ri=n-1;
        while(li<ri){
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
    }
}
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
   int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
   // functon calling
   rotatedmatrix(arr);
   for(var mat : arr){
    System.out.println(Arrays.toString(mat));
   }
    }
    }

